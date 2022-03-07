package Controlador;

import Modelo.Kardex;
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
public class ControladorKardex {

    public Kardex kar1;

    public ControladorKardex(Kardex kar1) {
        this.kar1 = kar1;
    }

    public ControladorKardex() {
    }

    public void calculoTotal() {
        BigDecimal bd = new BigDecimal(kar1.getCantidadEntrada() * kar1.getValorUnitarioEntrada()).setScale(2, RoundingMode.HALF_UP);
        kar1.setTotalEntrada(bd.doubleValue());
        bd = new BigDecimal(kar1.getCantidadSalida() * kar1.getValorUnitarioSalida()).setScale(2, RoundingMode.HALF_UP);
        kar1.setTotalSalida(bd.doubleValue());
    }

    public void calculoSaldos(Integer anteriorCantTotal, double anteriorTotal) {
        kar1.setCantidadTotal(anteriorCantTotal + kar1.getCantidadEntrada() - kar1.getCantidadSalida());
        BigDecimal bd = new BigDecimal(anteriorTotal + kar1.getTotalEntrada() - kar1.getTotalSalida()).setScale(2, RoundingMode.HALF_UP);
        kar1.setTotalTotal(bd.doubleValue());
        bd = new BigDecimal(kar1.getTotalTotal() / kar1.getCantidadTotal()).setScale(2, RoundingMode.HALF_UP);
        kar1.setValorUnitarioTotal(bd.doubleValue());
    }

    public void tablaPDF(String nomEmpresa, String art, String cod, ArrayList<ControladorKardex> kars,PlantillaPDF pdf) {
        ControladorPlantillaPDF doc = new ControladorPlantillaPDF(pdf.getNombreUsuario(),pdf.getNombreArchivo());
        Image im = null;
        try {
            im = new Image(ImageDataFactory.create("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\CCB\\src\\Vista\\Imagen\\logo.png"));
            im.scaleAbsolute(150, 100).setFixedPosition(670,494);
        } catch (MalformedURLException e) {
            System.out.println("no se encuentra la imagen ");
        }
        Table table = new Table(11);
        table.addCell(new Cell(1, 11).setTextAlignment(TextAlignment.CENTER).add(new Paragraph(nomEmpresa)));
        table.addCell(new Cell(1, 11).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("TARJETA KARDEX")));
        table.addCell(new Cell(1, 4).setTextAlignment(TextAlignment.LEFT).add(new Paragraph("Articulo: " + art)));
        table.addCell(new Cell(1, 3).setTextAlignment(TextAlignment.LEFT).add(new Paragraph("Codigo: " + cod)));
        table.addCell(new Cell(1, 4).setTextAlignment(TextAlignment.LEFT).add(new Paragraph("Metodo : Promedio ")));
        table.addCell(new Cell(2, 1).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("Fecha"))).addCell(new Cell(2, 1).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("Detalle"))).addCell(new Cell(1, 3).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("ENTRADAS"))).addCell(new Cell(1, 3).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("SALIDAS"))).addCell(new Cell(1, 3).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("SALDOS")));
        table.addCell("Cant").addCell("Vr/U").addCell("Total").addCell("Cant").addCell("Vr/U").addCell("Total").addCell("Cant").addCell("Vr/U").addCell("Total");
        for (ControladorKardex kar : kars) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dateToStr = dateFormat.format(kar.kar1.getFecha());
            table.addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(dateToStr))).addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(kar.kar1.getDetalle())));
            celdas(table, kar.kar1.getCantidadEntrada(), kar.kar1.getValorUnitarioEntrada(), kar.kar1.getTotalEntrada());
            celdas(table, kar.kar1.getCantidadSalida(), kar.kar1.getValorUnitarioSalida(), kar.kar1.getTotalSalida());
            celdas(table, kar.kar1.getCantidadTotal(), kar.kar1.getValorUnitarioTotal(), kar.kar1.getTotalTotal());
        }
        doc.CrearPlantilla(PageSize.A4.rotate(),im,table);
    }

    public void celdas(Table table, Integer num, Double num2, Double num3) {
        table.addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(Integer.toString(num))))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(Double.toString(num2))))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(Double.toString(num3))));
    }
}
