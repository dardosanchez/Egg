
package Ejercicios;

import java.util.Scanner;


public class ExtrasN6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantPersonas,altura,suma=0,cantidad=0,sumaTotal=0;
        System.out.print("Cuantas personas desea ingresar? ");
        cantPersonas = entrada.nextInt();
        
        for(int i=0;i<cantPersonas;i++){
            System.out.print("Altura de la persona: ");
            altura = entrada.nextInt();
            sumaTotal+=altura;
            
            if(altura<160){
                suma+=altura;
                cantidad++;
            }
        }
        
        System.out.print("El promedio de estaturas debajo de 1.60 mts es : ");
        System.out.println(suma/cantidad);
        
        System.out.print("El promedio de estatura general es: ");
        System.out.println(sumaTotal/cantidad);
    }
}
