
package Ejercicios;

public class ExtrasN2 {

    public static void main(String[] args) {
       int []vectorA = {1,2,3,4,5,6,7,8,9,10};
       int []vectorB = {1,2,3,4,5,6,7,8,9,13};
       int i=0;
       boolean bandera = true;
       
       while(bandera && i<vectorA.length){
           if(vectorA[i] != vectorB[i]){
               bandera = false;
           }
           i++;
       }
       if(bandera){
           System.out.println("Los vectores son iguales");
       } else {
        System.out.println("Los vctores son diferentes");
    }
    }
    
}
