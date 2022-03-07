package Controlador;

import Modelo.Extras;
import Modelo.PlantillaPDF;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.net.MalformedURLException;

/**
 * @author K.G 
 */
public class ControladorExtras {

    public Extras horasExtra;
    public String calculo1;
    public String calculo2;
    public String calculo3;
    public String calculo4;
    
    public ControladorExtras(int horas, double sueldoBasico) {
        this.horasExtra = new Extras(horas, sueldoBasico);
    }

    public ControladorExtras() {
    }

    public double resultado() {
        double numCal_1 = horasExtra.calculo_1();
        double numCal_2 = horasExtra.calculo_2(numCal_1);
        double numCal_3 = horasExtra.calculo_3(numCal_1, numCal_2);
        double numCal_4 = horasExtra.calculo_4(numCal_3);
        calculo1 = String.valueOf(numCal_1);
        calculo2 = String.valueOf(numCal_2);
        calculo3 = String.valueOf(numCal_3);
        calculo4 = String.valueOf(numCal_4);
        return numCal_4;
    }

    public void tablaPDF( PlantillaPDF pdf) {
        ControladorPlantillaPDF doc = new ControladorPlantillaPDF(pdf.getNombreUsuario(), pdf.getNombreArchivo());
        Image im = null;
        try {
            im = new Image(ImageDataFactory.create("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\CCB\\src\\Vista\\Imagen\\logo.png"));
            im.scaleAbsolute(150, 100).setFixedPosition(455, 750);
        } catch (MalformedURLException e) {
            System.out.println("no se encuentra la imagen ");
        }
        Table table = new Table(2);
        table.addCell(new Cell(1, 2).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("HORAS EXTRA")));
        table.addCell(new Cell(1, 2).setTextAlignment(TextAlignment.LEFT).add(new Paragraph("Horas : " + horasExtra.getHoras())));
        table.addCell(new Cell(1, 2).setTextAlignment(TextAlignment.LEFT).add(new Paragraph(" Sueldo básico : " + horasExtra.getSueldoBasico())));
        table.addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(horasExtra.getSueldoBasico() + "/240 = ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(calculo1)))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(calculo1 + " * 100% = ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(calculo2)))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(calculo1 + " + " + calculo2 + " = ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(calculo3)))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(horasExtra.getHoras() + " * " + calculo3 + " = ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(calculo4)));
        doc.CrearPlantilla(PageSize.A4, im, table);
    }
}
