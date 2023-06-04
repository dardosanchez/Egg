
package Ejercicios;

import java.util.Scanner;


public class ExtrasN11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,cantDigitos=0;
        
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        do {            
            numero/=10;
            cantDigitos++;
        } while (numero>0);
       
        System.out.println("La cantidad de digitos es " + cantDigitos);
    }
    
}
