
import java.util.Scanner;


public class Juego {
    // ATRIBUTOS
    private int jugador1Ganadas;
    private int jugador2Ganadas;
    public double numero1;
    
    
    // METODOS
    
    public Juego(){
        jugador1Ganadas = 0;
        jugador2Ganadas = 0;
    }
    
    
    
    public void iniciar_juego () {
        Scanner entrada = new Scanner(System.in);
        int intentos=5;
        double numero,numSecreto;
        boolean encontrado = false;
        
        System.out.println("JUGADOR N°1");
        System.out.print("Eliga un numero: ");
        numSecreto = entrada.nextDouble();
        
        System.out.println("=============================");
        
        System.out.println("JUGADOR N°2");
        System.out.println("Intente adivinar el numero. Tiene 3 intentos.");
        
        while(intentos>0 && !encontrado){
            System.out.print("INTENTO N°" + (6-intentos) + ": ");
            numero = entrada.nextDouble();
            if(numero == numSecreto){
                System.out.println("Correcto, adivinaste el numero. FELICITACIONES!");
                jugador2Ganadas++;
                encontrado = true;
            } else{
                if(numSecreto < numero){
                    System.out.println("El número es más bajo");
                } else {
                    System.out.println("El número es más alto");
                }
                intentos--;
            }
            
            // Si el jugador 2 no adivina el número, el jugador 1 gana
            if (intentos == 0) {
                System.out.println("Lo siento, has agotado tus intentos. El número era " + numSecreto + ".");
                jugador1Ganadas++;
            }
            
            // Preguntar si quieren jugar de nuevo
            System.out.println("¿Quieren jugar de nuevo? (s/n)");
            String respuesta = entrada.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }
        
        // Mostrar resultados finales
        System.out.println("Resultados finales:");
        System.out.println("Jugador 1 ganó " + jugador1Ganadas + " veces.");
        System.out.println("Jugador 2 ganó " + jugador2Ganadas + " veces.");
        
    }
}
