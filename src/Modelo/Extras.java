package Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author K.G 
 */
public class Extras extends Horas implements InterfaceCalculosHoras {

    public final double PORCENTAJE = 1.00;

    public Extras(int horas, double sueldoBasico) {
        super(horas, sueldoBasico);
    }

    @Override
    public double calculo_1() {
        BigDecimal bd = new BigDecimal(super.getSueldoBasico() / 240).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public double calculo_2(double numCal_1) {
        BigDecimal bd = new BigDecimal(numCal_1 * PORCENTAJE).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public double calculo_3(double numCal_1, double numCal_2) {
        BigDecimal bd = new BigDecimal(numCal_1 + numCal_2).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public double calculo_4(double numCal_3) {
        BigDecimal bd = new BigDecimal(super.getHoras() * numCal_3).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
