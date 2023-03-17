package Ejercicios;

import java.util.Scanner;

public class ExtrasN5 {

    public static void main(String[] args) {
        char clase;
        double costo;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite la clase: ");
        clase = entrada.next().charAt(0);
        System.out.print("Digite el precio: $");
        costo = entrada.nextDouble();

        clase = Character.toUpperCase(clase);
        switch (clase) {
            case 'A':
                System.out.print("Importe a pagar: ");
                System.out.println("$"+(costo/2));
                break;
            case 'B':
                System.out.print("Importe a pagar: ");
                System.out.println("$" + (costo-(costo*0.35)) );
                break;
            case 'C':
                System.out.print("Importe a pagar: ");
                System.out.println("$" + costo);
                break;
        }

    }

}
