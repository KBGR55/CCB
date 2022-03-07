package Modelo;

/**
 * @author K.G
 */
public class Horas {
    private int horas=0;
    private double sueldoBasico=425.00;
     
    public Horas(int horas,double sueldoBasico) {
        this.horas=horas;
        this.sueldoBasico=sueldoBasico;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
} 
