
package Ejercicios;

import java.util.Scanner;

public class ExtrasN13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Ingresar la altura de la escalera: ");
        numero = entrada.nextInt();
        
        for(int i=1;i<=numero;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
    
}
