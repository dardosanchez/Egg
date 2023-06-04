
package Ejercicios;

import java.util.Scanner;

public class ExtrasN1 {
    public static void main(String[] args) {
        int tamanio,suma=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos: ");
        
        tamanio = entrada.nextInt();
        
        int [] vector = new int [tamanio];
        
        for(int i=0;i<tamanio;i++){
            System.out.print("Ingrese un numero: ");
            vector[i] = entrada.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de todos los elementos es: " + suma);
    }
}
