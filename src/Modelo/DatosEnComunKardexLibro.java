package Modelo;

import java.util.Date;

/**
 * @author K.G
 */

public class DatosEnComunKardexLibro {

    private Date fecha;
    private String detalle;

    public DatosEnComunKardexLibro(Date fecha, String detalle) {
        this.fecha = fecha;
        this.detalle = detalle;
    }

    public DatosEnComunKardexLibro() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}
