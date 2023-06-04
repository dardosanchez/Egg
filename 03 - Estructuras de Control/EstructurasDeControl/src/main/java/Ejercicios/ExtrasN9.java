package Ejercicios;

import java.util.Scanner;

public class ExtrasN9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dividendo, divisor, cociente = 0;

        System.out.print("Ingrese el numero a divir: ");
        dividendo = entrada.nextInt();
        System.out.print("Ingrese el divisor: ");
        divisor = entrada.nextInt();

        do {
            dividendo = dividendo - divisor;
            cociente++;
        } while (dividendo > divisor);

        System.out.println("El residuo es " + dividendo);
        System.out.println("El cociente es " + cociente);
    }

}
