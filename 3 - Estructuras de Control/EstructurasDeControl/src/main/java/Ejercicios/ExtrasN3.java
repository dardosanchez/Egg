
package Ejercicios;

import java.util.Scanner;


public class ExtrasN3 {
    public static void main(String[] args) {
        String letra;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        letra = entrada.next();
        
        letra = letra.toUpperCase();
        
        if(letra.equals("A")|| letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println(letra + " es una vocal");
        } else {
            System.out.println(letra + " no es una vocal");
        }
        
    }
}
