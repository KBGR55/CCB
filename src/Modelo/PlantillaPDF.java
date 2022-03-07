package Modelo;

import com.itextpdf.layout.element.Paragraph;
import java.time.LocalDate;

/**
 * @author K.G 
 */

public class PlantillaPDF {
    private String nombreUsuario;
    private String fecha;
    private String nombreArchivo;
    private Paragraph titulo;
    
    public PlantillaPDF(String nombreUsuario,String nombreArchivo) {
        this.nombreUsuario = nombreUsuario;
        LocalDate todaysDate = LocalDate.now();
        this.fecha =todaysDate.toString();
        this.nombreArchivo = nombreArchivo;
        this.titulo=new Paragraph("Calculadora Contable Básica");
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Paragraph getTitulo() {
        return titulo;
    }

    public void setTitulo(Paragraph titulo) {
        this.titulo = titulo;
    }

}
