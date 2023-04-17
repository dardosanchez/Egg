package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[9];
        String respuesta;

        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes: ");
        respuesta = entrada.nextLine();
        respuesta = respuesta.toLowerCase(); // Comvieto la cadena en minuscula
        
        
        while (!respuesta.equals(mesSecreto)) {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            respuesta = entrada.nextLine();
            respuesta = respuesta.toLowerCase(); // Comvieto la cadena en minuscula
        }
        
        System.out.println("¡Ha acertado!");

    }

}
