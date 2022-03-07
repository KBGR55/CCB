package Modelo;

import java.util.Date;

/**
 * @author K.G 
 */
public class Kardex extends DatosEnComunKardexLibro {

    private Integer cantidadEntrada = 0;
    private Double valorUnitarioEntrada = 0.00;
    private Double totalEntrada = 0.00;
    private Integer cantidadSalida = 0;
    private Double valorUnitarioSalida = 0.00;
    private Double totalSalida = 0.00;
    private Integer cantidadTotal = 0;
    private Double valorUnitarioTotal = 0.00;
    private Double totalTotal = 0.00;

    public Kardex(Date fecha, String detalle, Integer cantidadEntrada, Double valorUnitarioEntrada) {
        super(fecha, detalle);
        this.cantidadEntrada = cantidadEntrada;
        this.valorUnitarioEntrada = valorUnitarioEntrada;
    }

    public Kardex(Integer cantidadSalida, Double valorUnitarioSalida, Date fecha, String detalle) {
        super(fecha, detalle);
        this.cantidadSalida = cantidadSalida;
        this.valorUnitarioSalida = valorUnitarioSalida;
    }

    public Integer getCantidadEntrada() {
        return cantidadEntrada;
    }

    public void setCantidadEntrada(Integer cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }

    public Double getValorUnitarioEntrada() {
        return valorUnitarioEntrada;
    }

    public void setValorUnitarioEntrada(Double valorUnitarioEntrada) {
        this.valorUnitarioEntrada = valorUnitarioEntrada;
    }

    public Double getTotalEntrada() {
        return totalEntrada;
    }

    public void setTotalEntrada(Double totalEntrada) {
        this.totalEntrada = totalEntrada;
    }

    public Integer getCantidadSalida() {
        return cantidadSalida;
    }

    public void setCantidadSalida(Integer cantidadSalida) {
        this.cantidadSalida = cantidadSalida;
    }

    public Double getValorUnitarioSalida() {
        return valorUnitarioSalida;
    }

    public void setValorUnitarioSalida(Double valorUnitarioSalida) {
        this.valorUnitarioSalida = valorUnitarioSalida;
    }

    public Double getTotalSalida() {
        return totalSalida;
    }

    public void setTotalSalida(Double totalSalida) {
        this.totalSalida = totalSalida;
    }

    public Integer getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Integer cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public Double getValorUnitarioTotal() {
        return valorUnitarioTotal;
    }

    public void setValorUnitarioTotal(Double valorUnitarioTotal) {
        this.valorUnitarioTotal = valorUnitarioTotal;
    }

    public Double getTotalTotal() {
        return totalTotal;
    }

    public void setTotalTotal(Double totalTotal) {
        this.totalTotal = totalTotal;
    }

}
