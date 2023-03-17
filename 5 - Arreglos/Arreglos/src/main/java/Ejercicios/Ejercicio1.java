
package Ejercicios;

public class Ejercicio1 {

    public static void main(String[] args) {
       
        int [] vector = new int [100];
        
        for(int i=0;i<100;i++){
            vector[i] = (100-i);
        }
        
        for(int i=0;i<100;i++){
            System.out.println("N° " + vector[i]);
        }
        
    }
    
}
