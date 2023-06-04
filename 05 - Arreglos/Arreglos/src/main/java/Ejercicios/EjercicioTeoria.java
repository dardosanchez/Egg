
package Ejercicios;

import java.util.Scanner;

public class EjercicioTeoria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        String [] vector;
        
        System.out.print("Cuantos integrastes son? ");
        cantidad = entrada.nextInt();
        
        vector = new String [cantidad];
        cargarVector(vector,cantidad);
        System.out.println("");
        mostrarVector(vector,cantidad);
  
    }
    
    public static void cargarVector (String [] vector,int cantidad){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<cantidad;i++){
            System.out.print("Compañero N°" + (i+1) + ": ");
            vector[i] = entrada.nextLine();
        }
        
    }
    
    public static void mostrarVector(String [] vector, int cantidad){
        System.out.print("Los integrantes del equipo son ");
        for(int i=0;i<cantidad;i++){
            
            System.out.print(vector[i] + ", ");
        }
    }
    
}
