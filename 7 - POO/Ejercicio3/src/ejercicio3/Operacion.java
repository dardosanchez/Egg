
package ejercicio3;

import java.util.Scanner;


public class Operacion {
    // ATRIBUTOS
    private double numero1;
    private double numero2;
    
    // METODO
    // CONTRUCTOR
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion () {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los dos numeros");
        System.out.print("Numero 1: ");
        setNumero1(entrada.nextDouble());
        System.out.print("Numero 2: ");
        setNumero2(entrada.nextDouble());
    }
    
    public double suma(){
       
        return (getNumero1()+getNumero2());
    }
    
    public double restar (){
        return (getNumero1() - getNumero2());
    }
    
    public double multiplicar(){
        
        if(getNumero1() != 0 && getNumero2()!=0){
            System.out.println("Se esta multiplicando por cero");
            return 0;
        } else {
            return (getNumero1() * getNumero2());
        }
    }
    
    public double dividir () {
        if(getNumero1() != 0 && getNumero2()!=0){
            System.out.println("Error. Se esta intentando dividir por cero.");
            return 0;
        } else {
            return (getNumero1() / getNumero2());
        }
    }
    
}
