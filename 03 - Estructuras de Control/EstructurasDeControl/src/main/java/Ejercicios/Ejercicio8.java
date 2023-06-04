
package Ejercicios;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        int lado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el tamaño del cuadrado: ");
        lado = entrada.nextInt();
        
        
        for(int i=0;i<lado;i++){
            for(int j=0;j<lado;j++){
                if(i==0 || i== lado-1 || j==0 || j==lado-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
