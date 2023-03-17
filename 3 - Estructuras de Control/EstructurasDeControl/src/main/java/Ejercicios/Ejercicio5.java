
package Ejercicios;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        int limite,numero1,suma=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el limite positivo: ");
        limite = entrada.nextInt();
        
        do {            
            System.out.print("Numero: ");
            numero1 = entrada.nextInt();
            suma = suma + numero1;
           // suma+=numero1
        } while (suma<=limite);
        
        System.out.println("Se supero el limite positivo");
    }
}
