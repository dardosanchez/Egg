
package Servicios;

import Entidad.ParDeNumeros;


public class ParDeNumerosService {
    
    public void mostrarValores (ParDeNumeros pn){
        System.out.println("Numero 1: " + pn.getNum1());
        System.out.println("Numero 2: " + pn.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros pn){
        
        return Math.max(pn.getNum1(), pn.getNum2());
        
    }
    

    public double calcularPotencia (ParDeNumeros pn){
        
        double num1 =  Math.round(pn.getNum1());
        double num2 =  Math.round(pn.getNum2()); 
        
        return Math.pow(Math.max(num2, num1), Math.min(num2, num1));
    }
    
    public double calculaRaiz (ParDeNumeros pn){
        double menor = Math.min(pn.getNum1(), pn.getNum2());
        Math.abs(menor);
        return Math.sqrt(menor);
    }
    
}
