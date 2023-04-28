
package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ejercicio1 {

  
    public static void main(String[] args) {
        
        // EJERCICIO 1
        Scanner entrada = new Scanner(System.in);
        boolean rta = true;
        // Collections
        ArrayList<String> razasPerros = new ArrayList<>();
        String raza;
        while(rta){
            System.out.print("Ingrese la raza: ");
            raza = entrada.nextLine();
            
            razasPerros.add(raza);
            
            System.out.print("Desea agregar otra raza? (S/N) ");
            char respuesta = entrada.nextLine().charAt(0);
            respuesta = Character.toUpperCase(respuesta);
            
            if(respuesta == 'N'){
                rta = false;
            }
        }

        System.out.print("Las razas ingresadas son: ");
        for (String var : razasPerros) {
            System.out.print(var);
            System.out.print(" ");
        }

        System.out.println("");

        // EJERICIO 2
        Iterator<String> it = razasPerros.iterator();
        boolean seEncontro = false;

        System.out.print("Ingrese un perro a eliminar: ");
        raza = entrada.nextLine();

        while (it.hasNext()) {
            String aux = it.next();
            
            if (aux.equals(raza)) {
                it.remove();
                seEncontro = true;
            }
        }

        if(!seEncontro){
            System.out.println("El perro ingresado no se encuentra en la lista");
        }
        
        
        System.out.print("Las lista actualizada es: ");
        for (String var : razasPerros) {
            System.out.print(var);
            System.out.print(" ");
        }
        
        System.out.println(" ");
    }
    
}
