package ejercicio1.extras;

import java.util.ArrayList;
import java.util.Scanner;

/*

1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).

 */
public class Ejercicio1Extras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int numero,suma=0;
        
        do{
            System.out.print("Numero: ");
            numero = entrada.nextInt();
            if(numero!=(-99)){
                listaNumeros.add(numero);
                suma += numero;
            }
            
        } while(numero!=(-99));
        
        System.out.println("- Cantidad de numeros leidos: " + listaNumeros.size());
        System.out.println("- Suma de todos los valores: "  + suma);
        System.out.println("- Promedio de todos los valores: " + suma/listaNumeros.size());
        
    }

}
