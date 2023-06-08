
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Principal {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
 
        int aleatorio = random.nextInt(1500) + 1;
        int numero=-1, intentos = 0;


        do {

            try {
                System.out.print("- Ingrese un numero: ");
                numero = entrada.nextInt();
                
                if (numero < aleatorio) {
                    System.out.println("Incorrecto el numero a adivinar es mas grande");
                } else {
                    if(numero > aleatorio){
                        System.out.println("Incorrecto el numero a adivinar es mas chico");
                    }
                }
                
            } catch (InputMismatchException e) {
                System.out.println("No ingresaste un numero!!");
                entrada.nextLine(); // LIMPIO EL BUFFER
            } finally {
                intentos++;
            }
             
        } while (numero != aleatorio);

        System.out.println("===========================================");
        System.out.println("Correcto! " + aleatorio + " era el numero.");
        System.out.println("Lo lograste en " + intentos + " intentos");

    }
    
}
