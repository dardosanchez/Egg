package Ejercicios;

import java.util.Scanner;

public class ExtrasN4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] vector = new double[10];
        double promedio = 0;
        int aprobados=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("====================================");
            System.out.println("Alumno N°" + (i + 1));

            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.print("- Primer trabajo práctico evaluativo: ");
                        promedio += entrada.nextInt() * 0.10;
                        break;
                    case 1:
                        System.out.print("- Segundo trabajo práctico evaluativo: ");
                        promedio += entrada.nextInt() * 0.15;
                        break;
                    case 2:
                        System.out.print("- Primer Integrador: ");
                        promedio += entrada.nextInt() * 0.25;
                        break;
                    case 3:
                        System.out.print("- Segundo integrador: ");
                        promedio += entrada.nextInt() * 0.50;
                        break;
                }
            }
            vector[i] = promedio;
            if(promedio>=70){
               aprobados++; 
            }
            promedio = 0;
        }
        System.out.println("====================================");
        System.out.println("La cantidad de alumnos aprobados son " + aprobados + ".");
    }
}
