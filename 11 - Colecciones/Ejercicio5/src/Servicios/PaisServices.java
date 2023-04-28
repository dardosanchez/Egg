
package Servicios;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class PaisServices {
    
    Scanner entrada = new Scanner(System.in);
    
    public void agregarPais (TreeSet<Pais> listaPais) {
        char respuesta;
        do {
            System.out.print("- Nombre del pais: ");
            String nombre = entrada.nextLine();
            
            listaPais.add(new Pais(nombre));
            
            //entrada.nextLine();  // LIMPIO EL BUFFER
            
            System.out.print("Desea ingresar otro pais? (S/N)" );
            respuesta = entrada.nextLine().charAt(0);
            respuesta = Character.toUpperCase(respuesta);
        } while(respuesta != 'N');
        
    }
    
    public void mostrarPaises (TreeSet<Pais> listaPais){
        System.out.println("La lista de paises es: ");
        for (Pais aux : listaPais) {
            System.out.print(" - " + aux.getNombre());
        } 
    }
    
    public void eliminarPais (TreeSet<Pais> listaPais){
        
        Iterator<Pais> it = listaPais.iterator();
        boolean seEncontro = false;
        
        System.out.print("- Ingrese el pais a eliminar: ");
        String respuesta = entrada.nextLine();
        
        while(it.hasNext()){
            Pais aux = it.next(); 
            if(aux.getNombre().equals(respuesta)){
                it.remove();
                seEncontro=true;
            }
        }
        
        if(!seEncontro){
            System.out.println("El pais '" + respuesta + "' no se ha encontrado");
        } else {
            
            mostrarPaises(listaPais);
            System.out.println("");
        }
    }
    
}
