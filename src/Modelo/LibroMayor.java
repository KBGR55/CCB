package Modelo;

import java.util.Date;

/**
 * @author K.G
 */
public class LibroMayor extends DatosEnComunKardexLibro {

    private Double debe = 0.00;
    private Double haber = 0.00;
    private Double saldo = 0.00;
    private String ref = "0/0";

    public LibroMayor(Date fecha, String detalle, String ref, Double debe) {
        super(fecha, detalle);
        this.ref = ref;
        this.debe = debe;
    }

    public LibroMayor(Double haber, Date fecha, String detalle, String ref) {
        super(fecha, detalle);
        this.ref = ref;
        this.haber = haber;
    }

    public Double getDebe() {
        return debe;
    }

    public void setDebe(Double debe) {
        this.debe = debe;
    }

    public Double getHaber() {
        return haber;
    }

    public void setHaber(Double haber) {
        this.haber = haber;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

}
