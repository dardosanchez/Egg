
package Ejercicios;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String frase;
        System.out.println("Ingrese la frase: ");
        frase = entrada.nextLine();
        
        if(frase.length() == 8){
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
        
    }
}
