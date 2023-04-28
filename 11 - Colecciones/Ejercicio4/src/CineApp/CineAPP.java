
package CineApp;

import Entidades.Pelicula;
import Servicios.PeliculaService;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

public class CineAPP {

   
    public static void main(String[] args) {
       
        PeliculaService ps = new PeliculaService();
        ArrayList <Pelicula> listaPeliculas = new ArrayList();
        
        ps.crearVariasPeliculas(listaPeliculas);
        System.out.println("");
        
        
        System.out.println("===============================================================");
        ps.mostrarPeliculas(listaPeliculas);
        System.out.println("===============================================================");
        ps.mostrarPeliculasUnaHora(listaPeliculas);
        
        System.out.println("===============================================================");
        // Ordeno las peliculas de acuerdo a su duracion (de mayor a menor)
        System.out.println("Las peliculas ordenadas de acuerdo a su duracion (de mayor a menor) es:");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracionDesc);
        ps.mostrarPeliculas(listaPeliculas);
        
        System.out.println("===============================================================");
        // Ordeno las peliculas de acuerdo a su duracion (de menor a mayor)
        System.out.println("Las peliculas ordenadas de acuerdo a su duracion (de menor a mayor) es:");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracionAscen);
        ps.mostrarPeliculas(listaPeliculas);
        
        System.out.println("===============================================================");
        // Ordeno las peliculas alfabeticamente 
        System.out.println("Las peliculas alfabeticamente es:");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorNombre);
        ps.mostrarPeliculas(listaPeliculas);
        
        System.out.println("===============================================================");
        // Ordeno las peliculas por director 
        System.out.println("Las peliculas ordenadas por director es:");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDirector);
        ps.mostrarPeliculas(listaPeliculas);
    }
    
}
