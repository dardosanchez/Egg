
package Ejercicios;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        boolean bandera;
        int bien=0,mal=0;
        
        do {            
            bandera = true;
            System.out.print("Ingrese la cadena: ");
            cadena = entrada.nextLine();
            
            if(cadena.length() != 5) {
                bandera = false;
            }
            if(!cadena.substring(0, 1).equals("X")){
                bandera = false;
            }
            if(!cadena.substring(4).equals("O")){
                bandera = false;
            }
            
            if(bandera){
                 bien++;
            }else { 
                  mal++;
            }
            
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("La cantidad de cadenas bien ingresadas son: " + bien);
        System.out.println("La cantidad de cadenas mal ingresadas son: " + (mal-1));
        
    }
}
