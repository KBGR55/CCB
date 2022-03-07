package Controlador;

import Modelo.BaseDatosConexion;
import Modelo.PlantillaPDF;
import Modelo.RepositorioPDF;
import Modelo.Usuario;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * @author K.G 
 */
public class ControladorPlantillaPDF {

    public PlantillaPDF pdf;
    public BaseDatosConexion conI;
    public PreparedStatement ps = null;
    public ResultSet rs = null;

    public ControladorPlantillaPDF(String nombreUsuario, String nombreArchivo) {
        this.pdf = new PlantillaPDF(nombreUsuario, nombreArchivo);
    }

    public ControladorPlantillaPDF() {
    }

    public void CrearPlantilla(PageSize formato, Image im, Table table) {
        pdf.getTitulo().setTextAlignment(TextAlignment.CENTER).setFontColor(ColorConstants.MAGENTA).setFontSize(25);
        File fichero = new File(pdf.getNombreArchivo() + "-" + pdf.getNombreUsuario() + ".pdf");
        try (PdfWriter writer = new PdfWriter(fichero); PdfDocument docPDF = new PdfDocument(writer); Document document = new Document(docPDF, formato)) {
            document.add(pdf.getTitulo());
            document.add(im);
            document.add(new Paragraph("Elaborado por: " + pdf.getNombreUsuario()));
            document.add(new Paragraph("Fecha: " + pdf.getFecha()));
            document.add(new Paragraph("\n"));
            try {
                document.add(table);
            } catch (Exception e) {
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("PDF creado");
    }

    public void AgregarPDFBaseDatos(File ruta, Usuario u, String nom, String op) {
        RepositorioPDF po = new RepositorioPDF();
        po.setEmail(u.getEmail());
        po.setNombre(u.getNombre());
        po.setNombrepdf(nom);
        po.setOpcion(op);
        try {
            byte[] pdfG = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdfG);
            po.setPdf(pdfG);
        } catch (IOException ex) {
            po.setPdf(null);
        }
        conI = new BaseDatosConexion();
        String sql = "INSERT INTO repositoriopdf (nombre,email,pdf,nombrepdf,opcion) VALUES(?,?,?,?,?);";
        try {
            ps = conI.conexion.prepareStatement(sql);
            ps.setString(1, po.getNombre());
            ps.setString(2, po.getEmail());
            ps.setBytes(3, po.getPdf());
            ps.setString(4, po.getNombrepdf());
            ps.setString(5, po.getOpcion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + "er");
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "errr");
        }
    }

    public ArrayList<RepositorioPDF> ListarRepositorio(String correo, String op) {
        ArrayList<RepositorioPDF> list = new ArrayList<>();
        conI = new BaseDatosConexion();
        String sql = "SELECT nombrepdf,pdf FROM repositoriopdf WHERE opcion = '" + op + "' &&  email = '" + correo + "'";
        try {
            ps = conI.conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                RepositorioPDF vo = new RepositorioPDF();
                vo.setNombrepdf(rs.getString(1));
                vo.setPdf(rs.getBytes(2));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public void verTabla(JTable tabla, Usuario u, String op) {
        tabla.setDefaultRenderer(Object.class, new ControladorImagenTabla());
        DefaultTableModel datosTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        datosTabla.addColumn("nombrepdf");
        datosTabla.addColumn("pdf");
        ImageIcon icono = null;
        if (obtenerImagen("/Vista/Imagen/imagPDF.png") != null) {
            icono = new ImageIcon(obtenerImagen("/Vista/Imagen/imagPDF.png"));
        }
        RepositorioPDF vo = new RepositorioPDF();
        ArrayList<RepositorioPDF> list = ListarRepositorio(u.getEmail(), op);
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[2];
                vo = list.get(i);
                fila[0] = vo.getNombrepdf();
                if (vo.getPdf() != null) {
                    fila[1] = new JButton(icono);
                } else {
                    fila[1] = new JButton("No hay archivo");
                }
                datosTabla.addRow(fila);
            }
            tabla.setModel(datosTabla);
            tabla.setRowHeight(32);
        }
    }

    public java.awt.Image obtenerImagen(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            java.awt.Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }

    public void ejecutarPDF(String opcion, String nombrepdf) {
        PreparedStatement psa = null;
        ResultSet rsa = null;
        conI = new BaseDatosConexion();
        byte[] b = null;

        try {
            psa = conI.conexion.prepareStatement("SELECT pdf FROM repositoriopdf WHERE  nombrepdf = ? &&  opcion = ? ");
            psa.setString(1, nombrepdf);
            psa.setString(2, opcion);
            rsa = psa.executeQuery();
            while (rsa.next()) {
                b = rsa.getBytes(1);
            }
            try (InputStream inputS = new ByteArrayInputStream(b)) {
                int tamanoInput = inputS.available();
                byte[] datosPDF = new byte[tamanoInput];
                inputS.read(datosPDF, 0, tamanoInput);
                try (OutputStream out = new FileOutputStream("ArchivoAbiertoExito.pdf")) {
                    out.write(datosPDF);
                }
            }
            psa.close();
            rsa.close();
        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

    class ControladorImagenTabla extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof JLabel) {
                JLabel lbl = (JLabel) value;
                return lbl;
            }

            if (value instanceof JButton) {
                JButton button = (JButton) value;
                if (isSelected) {
                    button.setForeground(table.getSelectionForeground());
                    button.setBackground(table.getSelectionBackground());
                } else {
                    button.setForeground(table.getForeground());
                    button.setBackground(UIManager.getColor("Button.background"));
                }
                return button;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }
}
