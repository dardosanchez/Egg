
package Ejercicios;

import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
*/

public class ExtrasN1 {
    public static void main(String[] args) {
        int minutos,dias,horas;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos: ");
        minutos = entrada.nextInt();
        
        dias = minutos / 1440; 
        horas = (minutos % 1440)/60;
        
        System.out.println("Dias: " + dias);
        System.out.println("horas: " + horas);
    }
}
