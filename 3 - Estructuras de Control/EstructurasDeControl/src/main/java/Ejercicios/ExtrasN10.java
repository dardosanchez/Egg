
package Ejercicios;

import java.util.Scanner;

public class ExtrasN10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1,numero2,resultado,n;
        
        numero1 = Math.random() * (10);
        numero2 = Math.random() * (10); 
        resultado = numero1*numero2;
        
        System.out.println("Ingrese el resultado de "+numero1 + " + " + numero2);
        System.out.print("Resultado: ");
        n = entrada.nextInt();
        
        for(int i=0;i<1;i++){
            if(n!=resultado){
            System.out.println("El resultado es incorrecto. Vuelva a intentarlo...");
            System.out.print("Resultado: ");
            n = entrada.nextInt();
        } else {
            System.out.println("CORRECTO! Adivinaste el resultado");
        }
        }
    }
    
}
