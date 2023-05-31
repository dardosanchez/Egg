
package Entidad;

import Interfaces.calculosFormas;


public class Circulo implements calculosFormas{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (PI*radio*radio);
    }

    @Override
    public double calcularPerimetro() {
        return PI*(radio*radio);
    }
    
}
