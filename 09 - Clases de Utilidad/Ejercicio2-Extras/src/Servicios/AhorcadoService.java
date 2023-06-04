package Servicios;

import Entidad.Ahorcado;

import java.util.Scanner;

public class AhorcadoService {

    Scanner entrada = new Scanner(System.in);

    public void crearJuego(Ahorcado a1) {
        System.out.println("      .: AHORCADO :.       ");
        System.out.print("- Ingresar la palabra: ");
        String palabra = entrada.nextLine();
        System.out.print("- Cantidad de jugadas maxima: ");
        int jugadas = entrada.nextInt();

        a1.setVector(new char[palabra.length()]);
        char[] auxVector = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            auxVector[i] = palabra.toLowerCase().charAt(i);
        }

        a1.setVector(auxVector);
        a1.setCantLetras(palabra.length());
        a1.setCantJugadasMax(jugadas);

    }

    public void longitud(Ahorcado a1) {
        System.out.println("La longitud de la palabra a encontrar es de "
                + a1.getCantLetras() + " letras.");
    }

    public void buscar(char letra, Ahorcado a1) {
        boolean esParte = false;
        char[] auxVector = a1.getVector();
        letra = Character.toLowerCase(letra);

        for (int i = 0; i < a1.getCantLetras(); i++) {
            if (auxVector[i] == letra) {
                esParte = true;
            }
        }
        if (esParte) {
            System.out.println("La letra es parte de la palabra");
        } else {
            System.out.println("La letra no es parte de la palabra");
        }
    }

    public boolean encontradas(char letra, Ahorcado a1) {

        boolean encontrada = false;
        char[] auxVector = a1.getVector();
        letra = Character.toLowerCase(letra);

        for (int i = 0; i < a1.getCantLetras(); i++) {
            if (auxVector[i] == letra) {
                a1.setEncontradas(a1.getEncontradas() + 1); // Letras enontradas +1
                encontrada = true;
            }
        }

        // Si no acerto en la letra resto un intento
        if (!encontrada) {
            a1.setCantJugadasMax(a1.getCantJugadasMax() - 1);
        }

        System.out.println("Número de letras (encontradas, faltantes): " + "("
                + a1.getEncontradas() + "," + (a1.getCantLetras() - a1.getEncontradas()) + ")");

        return encontrada;
    }

    public void intentos(Ahorcado a1) {
        System.out.println("Intentos restantes: " + a1.getCantJugadasMax());
    }

    public void juego(Ahorcado a1) {
        char let;
        int i=0;
        crearJuego(a1);
        char [] auxIngreso = new char [100];
        boolean termino = false;
        
        do {
            System.out.println("==================================");
            System.out.print("Ingrese una letra: ");
            let = entrada.next().charAt(0);
            let = Character.toLowerCase(let);
            
            /*
            // Valido si ya ingreso la letra
            while(!seIngresoLetra(let,auxIngreso)){
                 System.out.println("- La letra " + let + " ya fue ingresada. Intentelo nuevamente...");
                 System.out.print("Ingrese una letra: ");
                 let = entrada.next().charAt(0);
                 let = Character.toLowerCase(let);
            }
            auxIngreso[i]=let; // Coloco la letra ingresada en el arreglo
            */
            
            longitud(a1);
            buscar(let, a1);
            encontradas(let, a1);
            intentos(a1);
            
            if(a1.getEncontradas() == a1.getCantLetras()){
                termino = true;
            }
            i++;
        } while (a1.getCantJugadasMax() > 0 && !termino);
        
        System.out.println("");
        System.out.println("");
        
        if(termino== true){
            System.out.println("========================================");
            System.out.println("||   CORRECTO! ADIVINASTE LA PLABRA   ||");
            System.out.println("========================================");

        } else {
            System.out.println("==============================================");
            System.out.println("||   LO SENTIMOS, NO HAY MAS OPORTUNIDADES   ||");
            System.out.println("==============================================");
        }
        
    }
    
    /*
    public boolean seIngresoLetra (char letra, char [] auxIngreso){
        int i=0;
        boolean ingreso = false;
        
        while(i< auxIngreso.length || !ingreso){
            
            if(auxIngreso [i] == letra){
                ingreso = true;
            }
            
            i++;
        }
        
        return ingreso;
    }
    */
}
