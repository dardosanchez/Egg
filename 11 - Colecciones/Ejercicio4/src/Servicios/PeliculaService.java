
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Pelicula crearPelicula (){
        
        System.out.print("- Titulo: ");
        String titulo = entrada.nextLine();
        System.out.print("- Director: ");
        String director = entrada.nextLine();
        System.out.print("- Duracion (hs): ");
        double duracion = entrada.nextDouble();
        
        return new Pelicula(titulo, director, duracion);
        
    }
    
    public void crearVariasPeliculas (ArrayList <Pelicula> lista){
        char respuesta;
        do {
            lista.add(crearPelicula());
            entrada.nextLine();  // LIMPIO EL BUFFER
            
            System.out.print("Desea ingresar otra pelicula? (S/N)" );
            respuesta = entrada.nextLine().charAt(0);
            respuesta = Character.toUpperCase(respuesta);
        } while(respuesta != 'N');
        
    }
    
    public void mostrarPeliculas (ArrayList <Pelicula> lista){
        
        System.out.println("Las peliculas son: ");
        for (Pelicula aux : lista) {
            System.out.print("- " + aux.getTitulo() + " ");
        }
        System.out.println("");
    }
    
    public void mostrarPeliculasUnaHora (ArrayList <Pelicula> lista){
        
        System.out.println("Las peliculas que duran mas de una hora son: ");
        for (Pelicula aux : lista) {
            if(aux.getDuracion()> 1){
                System.out.print(aux.getTitulo() + " ");
            }
        }
        System.out.println("");
    }
    
}
