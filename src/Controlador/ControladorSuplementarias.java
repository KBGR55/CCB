package Controlador;

import Modelo.PlantillaPDF;
import Modelo.Suplementarias;
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
public class ControladorSuplementarias {

    public Suplementarias horasSuplementarias;
    public String calculo1;
    public String calculo2;
    public String calculo3;
    public String calculo4;
    
    public ControladorSuplementarias(int horas, double sueldoBasico) {
        this.horasSuplementarias = new Suplementarias(horas, sueldoBasico);
    }

    public ControladorSuplementarias() {
    }

    public double resultado() {
        double numCal_1 = horasSuplementarias.calculo_1();
        double numCal_2 = horasSuplementarias.calculo_2(numCal_1);
        double numCal_3 = horasSuplementarias.calculo_3(numCal_1, numCal_2);
        double numCal_4 = horasSuplementarias.calculo_4(numCal_3);
        calculo1 = String.valueOf(numCal_1);
        calculo2 = String.valueOf(numCal_2);
        calculo3 = String.valueOf(numCal_3);
        calculo4 = String.valueOf(numCal_4);
        return numCal_4;
    }
    
    public void tablaPDF(PlantillaPDF pdf) {
        ControladorPlantillaPDF doc = new ControladorPlantillaPDF(pdf.getNombreUsuario(), pdf.getNombreArchivo());
        Image im = null;
        try {
            im = new Image(ImageDataFactory.create("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\CCB\\src\\Vista\\Imagen\\logo.png"));
            im.scaleAbsolute(150, 100).setFixedPosition(455, 750);
        } catch (MalformedURLException e) {
            System.out.println("no se encuentra la imagen ");
        }
        Table table = new Table(2);
        table.addCell(new Cell(1, 2).setTextAlignment(TextAlignment.CENTER).add(new Paragraph("HORAS SUPLEMENTARIAS")));
        table.addCell(new Cell(1, 2).setTextAlignment(TextAlignment.LEFT).add(new Paragraph("Horas : " + horasSuplementarias.getHoras())));
        table.addCell(new Cell(1, 2).setTextAlignment(TextAlignment.LEFT).add(new Paragraph(" Sueldo básico : " + horasSuplementarias.getSueldoBasico())));
        table.addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(horasSuplementarias.getSueldoBasico() + "/240 = ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(calculo1)))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(calculo1 + " * 50% = ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(calculo2)))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(calculo1 + " + " + calculo2 + " = ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(calculo3)))
                .addCell(new Cell().setTextAlignment(TextAlignment.RIGHT).add(new Paragraph(horasSuplementarias.getHoras() + " * " + calculo3 + " = ")))
                .addCell(new Cell().setTextAlignment(TextAlignment.LEFT).add(new Paragraph(calculo4)));
        doc.CrearPlantilla(PageSize.A4, im, table);
    }
}
