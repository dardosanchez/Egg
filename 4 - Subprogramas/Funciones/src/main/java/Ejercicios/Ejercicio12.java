
package Ejercicios;

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
        int num1,num2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dos numeros");
        System.out.print("Numero 1: ");
        num1 = entrada.nextInt();
        System.out.print("Numero 2: ");
        num2 = entrada.nextInt();
        
        EsMultiplo(num1,num2);
    }
    
    public static void EsMultiplo (int num1, int num2){
        
        if(num1%num2 == 0){
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
             System.out.println(num1 + " no es multiplo de " + num2);
        }
        
    }
    
}
