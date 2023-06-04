
package ejercicio2;

import java.util.Scanner;

public class Circunferencia {
    // ATRIBUTOS    
    private double radio;
    
    // METODOS
    // CONSTRUCTOR
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    // GET
    public double getRadio() {
        return radio;
    }
    // SET

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        setRadio(entrada.nextDouble());
    }
    
    public double area(){
        return Math.pow(3.1415*getRadio(),2);
    }
    
    public double perimetro(){
        return (2*3.1415*getRadio());
    }
}
