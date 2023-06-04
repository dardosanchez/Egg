
package Ejercicios;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         String frase;
         
         frase = entrada.nextLine();
         System.out.println();
         
         if ((frase.substring(0,1).equals("A"))) {
             System.out.println("CORRECTO");
         } else {
             System.out.println("INCORRECTO");
         }
    }
}
