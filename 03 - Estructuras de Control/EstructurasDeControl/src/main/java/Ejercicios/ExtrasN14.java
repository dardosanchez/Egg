package Ejercicios;

import java.util.Scanner;

public class ExtrasN14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nFamilias, mHijos, edad, totalHijos = 0, totalEdad = 0;

        System.out.print("Ingrese la cantidad de familias: ");
        nFamilias = entrada.nextInt();

        for (int i = 1; i <= nFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia N°" + i + ": ");
            mHijos = entrada.nextInt();

            for (int j = 1; j <= mHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                edad = entrada.nextInt();
                totalHijos++;
                totalEdad += edad;
            }
        }
        System.out.println("");
        System.out.println("La media de edad de los hijos de todas las familias es " + (totalEdad / totalHijos));
    }

}
