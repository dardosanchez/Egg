package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner entrada = new Scanner(System.in);

    public Persona crearPersona() {
        char sexo;
        
        
        
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Edad: ");
        int edad = entrada.nextInt();

        do {
            System.out.print("Sexo: ");
            sexo = entrada.next().charAt(0);
        } while (!comprobarCaracter(sexo));

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        
        // Limpiar el Buffer
        entrada.nextLine();
        
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        return p1;
    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean bandera;
        if (p1.edad >= 18) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    public boolean comprobarCaracter(char c) {
        c = Character.toUpperCase(c);
        if (c != 'H' && c != 'M' && c != 'O') {
            System.out.println("Caracter ingresado incorrecto. Ingrese nuevamente");
            return false;
        }
        return true;
    }

    public int calcularIMC(Persona p1) {
        double pesoIdeal = (p1.getPeso() / (p1.getAltura() * p1.getAltura()));
        int retorno;

        if (pesoIdeal < 20) {
            retorno = -1;
        } else {
            if (pesoIdeal >= 20 && pesoIdeal <= 25) {
                retorno = 0;
            } else {
                retorno = 1;
            }
        }
        return retorno;
    }

    public void calculos(Persona[] personas) {
        double[] edades = new double[2];  // Mayor o Menor de edad
        double[] IMC = new double[3];    // BajoPeso - PesoIdeal - SobrePeso

        for (int i = 0; i < personas.length; i++) {

            if (esMayorDeEdad(personas[i])) {
                edades[0]++;
            } else {
                edades[1]++;
            }

            switch (calcularIMC(personas[i])) {
                case -1:
                    IMC[0]++;
                    break;

                case 0:
                    IMC[1]++;
                    break;

                case 1:
                    IMC[2]++;
                    break;
            }
        }

        // Calculo de porcentajes
        double porcentajeIMC0 = (IMC[0] / personas.length) * 100;
        double porcentajeIMC1 = (IMC[1] / personas.length) * 100;
        double porcentajeIMC2 = (IMC[2] / personas.length) * 100;
        double porcentajeEdades0 = (edades[0] / personas.length) * 100;
        double porcentajeEdades1 = (edades[1] / personas.length) * 100;

        // Muestra de resultados
        System.out.println("Porcentaje de personas por debajo de su peso: " + porcentajeIMC0 + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajeIMC1 + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeIMC2 + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeEdades0 + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeEdades1 + "%");
    }

}
