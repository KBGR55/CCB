package Modelo;

/**
 * @author K.G 
 */
public class RepositorioPDF extends Persona {

    private String nombrepdf;
    private String opcion;
    private byte[] pdf;

    public RepositorioPDF(String nombrepdf, String opcion, byte[] pdf, String nombre, String email) {
        super(nombre, email);
        this.nombrepdf = nombrepdf;
        this.opcion = opcion;
        this.pdf = pdf;
    }

    public RepositorioPDF() {

    }

    public String getNombrepdf() {
        return nombrepdf;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }

}
