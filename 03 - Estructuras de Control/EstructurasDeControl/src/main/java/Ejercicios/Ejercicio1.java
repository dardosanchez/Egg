

package Ejercicios;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.print("Digite un numero: ");
        int numero;
        Scanner entrada = new Scanner (System.in);
        numero = entrada.nextInt();
        
        if(numero%2 == 0){
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }
}
