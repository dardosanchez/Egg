
package Ejercicios;

import java.util.Scanner;


public class ExtrasN8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,cantidad=0,pares=0,impares=0;
        boolean bandera=true;
        
        do {            
            System.out.print("Ingrese un numero: ");
            n = entrada.nextInt();
            if(n%5==0){
               
                break;
            }
            
            cantidad++;
            if(n%2==0) pares++;
            if(n%2==1) impares++;
        } while (bandera);
        
        System.out.println("=================================");
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        System.out.println("Cantidad de numeros leidos: " + cantidad);
    }
    
}
