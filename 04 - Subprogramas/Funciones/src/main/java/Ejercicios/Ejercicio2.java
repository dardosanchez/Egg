package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas Personas va a Ingresar");
        int N = leer.nextInt();

        checkedad(N);
    }

    public static void checkedad(int N) {
        String respuesta = "";
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese Nombre Persona " + (i + 1));
            String persona = leer.nextLine();
            System.out.println("Ingrese Edad Persona de " + persona);
            int edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println(persona + " tiene " + edad + " años. Es Mayor.");
            } else {
                System.out.println(persona + " tiene " + edad + " años. Es Menor.");
            }

            System.out.println("Desea seguir mostrando personas?");
            leer.next(); // Esto limpia el buffer del Scanner porque sino toma como respuesta lo anterior
                         // https://www.clasesdeinformaticaweb.com/java-desde-cero/el-buffer-de-la-clase-scanner/

            respuesta = leer.nextLine();

            if (respuesta.equals("No")) {
                break;
            }
        }

    }
}

    

