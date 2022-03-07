package Controlador;

import Modelo.LibroMayor;
import Modelo.PlantillaPDF;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author K.G
 */
public class ControladorLibroMayor {

    public LibroMayor lit;

    public ControladorLibroMayor(LibroMayor lit) {
        this.lit = lit;
    }

    public ControladorLibroMayor() {
    }

    public void calculoSaldos(Double cat) {
        BigDecimal bd = new BigDecimal(lit.getDebe()).setScale(2, RoundingMode.HALF_UP);
        lit.setDebe(bd.doubleValue());
        bd = new BigDecimal(lit.getHaber()).setScale(2, RoundingMode.HALF_UP);
        lit.setHaber(bd.doubleValue());
        bd = new BigDecimal(cat + lit.getDebe() - lit.getHaber()).setScale(2, RoundingMode.HALF_UP);
        lit.setSaldo(bd.doubleValue());
    }

    public void tablaPDF(String nomEmpresa, String cuent, String cod, ArrayList<ControladorLibroMayor> lits, PlantillaPDF pdf) {
        ControladorPlantillaPDF doc = new ControladorPlantillaPDF(pdf.getNombreUsuario(), pdf.getNombreArchivo());
        Image im = null;
        try {
            im = new Image(ImageDataFactory.create("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\CCB\\src\\Vista\\Imagen\\logo.png"));
            im.scaleAbsolute(150, 100).setFixedPosition(455, 750);
        } catch (MalformedURLException e) {
            System.out.println("no se encuentra la imagen ");
        }
        Table table = new Table(6);
        table.addCell(new Cell(1, 6).setTextAlignment(TextAlignment.CENTER).add(new Paragraph(nomEmpresa)));
        table.addCell(new Cell(1, 6).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("LIBRO MAYOR")));
        table.addCell(new Cell(1, 3).setTextAlignment(TextAlignment.LEFT).add(new Paragraph(" CUENTA : " + cuent)));
        table.addCell(new Cell(1, 3).setTextAlignment(TextAlignment.LEFT).add(new Paragraph(" CODIGO : " + cod)));
        table.addCell(new Cell().setTextAlignment(TextAlignment.CENTER).add(new Paragraph("FECHA"))).addCell(new Cell().setTextAlignment(TextAlignment.CENTER).add(new Paragraph("DETALLE"))).addCell(new Cell().setTextAlignment(TextAlignment.CENTER).add(new Paragraph("REF"))).addCell(new Cell().setTextAlignment(TextAlignment.CENTER).add(new Paragraph("DEBE"))).addCell(new Cell().setTextAlignment(TextAlignment.CENTER).add(new Paragraph("HABER"))).addCell(new Cell().setTextAlignment(TextAlignment.CENTER).add(new Paragraph("SALDO")));
        String saldo = "0.00";
        for (ControladorLibroMayor i : lits) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dateToStr = dateFormat.format(i.lit.getFecha());
            table.addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(dateToStr))).addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(i.lit.getDetalle()))).addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(i.lit.getRef())));
            table.addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(Double.toString(i.lit.getDebe())))).addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(Double.toString(i.lit.getHaber())))).addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(Double.toString(i.lit.getSaldo()))));
            saldo = Double.toString(i.lit.getSaldo());
        }
        table.addCell(new Cell(1, 3).setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(" TOTAL ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(sumasDebe(lits))))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(sumasHaber(lits))))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(saldo)));

        doc.CrearPlantilla(PageSize.A4,im,table);
    }

    public String sumasDebe(ArrayList<ControladorLibroMayor> lits) {
        String respuesta = "0.00";
        Double suma = 0.00;
        BigDecimal bd;
        for (ControladorLibroMayor lit1 : lits) {
            bd = new BigDecimal(suma).setScale(2, RoundingMode.HALF_UP);
            suma = bd.doubleValue() + lit1.lit.getDebe();
        }
        bd = new BigDecimal(suma).setScale(2, RoundingMode.HALF_UP);
        suma = bd.doubleValue();
        return respuesta = suma.toString();
    }

    public String sumasHaber(ArrayList<ControladorLibroMayor> lits) {
        String respuesta = "0.00";
        Double suma = 0.00;
        BigDecimal bd;
        for (ControladorLibroMayor lit1 : lits) {
            bd = new BigDecimal(suma).setScale(2, RoundingMode.HALF_UP);
            suma = bd.doubleValue() + lit1.lit.getHaber();
        }
        bd = new BigDecimal(suma).setScale(2, RoundingMode.HALF_UP);
        suma = bd.doubleValue();
        return respuesta = suma.toString();
    }

}

