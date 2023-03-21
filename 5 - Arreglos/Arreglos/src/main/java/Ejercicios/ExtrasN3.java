
package Ejercicios;

import java.util.Scanner;

public class ExtrasN3 {

    public static void main(String[] args) {
        int []vector;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantos elementos desea ingrear? ");
        vector = new int [entrada.nextInt()];
        
        cargarVector(vector);
        System.out.println("=======================");
        mostrarVector(vector);
    }
    
    public static void cargarVector (int [] vector){       
        for(int i=0;i<vector.length;i++){
           vector[i]= (int)(Math.random()*100);
        }
    }
    
    public static void mostrarVector(int [] vector){
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }  
    }
    
}
