
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int [] vector;
        int tamanio, numero, cantidad=0,posicion=0;
        boolean encontrado = false;
        
        System.out.print("Cuantos valores desea ingresar? ");
        tamanio = entrada.nextInt();
        
        vector = new int [tamanio];
        
        cargarVector(vector,tamanio);
        
        System.out.print("Ingrese un numero a buscar: ");
        numero = entrada.nextInt();
        
        for(int j=0;j<tamanio;j++){
            if(vector[j] == numero){
               cantidad++;
            }   
            if(vector[j] == numero && !encontrado){
               encontrado = true;
               posicion = j;
            }   
        }
        
        if(encontrado){
             System.out.print("El numero " + numero + " aparece " + cantidad );
             if(cantidad>1){
                 System.out.println(" veces. Y su primera ocurrencia es en la posicion " + posicion + ".");
             } else {
                 System.out.println(" vez. Y se encuentra en la posicion " + posicion + ".");
             }
        } else {
            System.out.println("El numero "+ numero + " no fue encontrado.");
        }
       
    }
    
    public static void cargarVector(int [] vector, int tamanio){
        for(int i=0;i<tamanio;i++){
            vector[i] = (int)(Math.random()*10) + 1;
        }
    }
    
}
