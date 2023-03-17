
package Ejercicios;

import java.util.Scanner;


public class Ejercicio2 {
        public static void main(String[] args) {
            
            System.out.print("Digite una frase: ");
            String frase;
            Scanner entrada = new Scanner (System.in);
            
            frase = entrada.nextLine();
            
            if(frase.equals("eureka") ){
                System.out.println("CORRECTO!");
            } else {
                System.out.println("INCORRECTO!");
            }
            
    }
}
