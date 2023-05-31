
package Servicios;

import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;


public class JugadorServices {
    
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    
    public Jugador crearJugador (int x){
 
        System.out.print("Nombre: ");
        String nombre = entrada.next();
        return new Jugador(x, nombre, false);
    }

    public ArrayList<Jugador> crearJugadores() {
        int cantJugadores;
        ArrayList<Jugador> lista = new ArrayList<>();
        
        do {
            System.out.print ("Cuantos jugadores desea ingresar? ");
            cantJugadores = entrada.nextInt();

            if (cantJugadores <= 6 && cantJugadores > 0) {
                for (int i = 0; i < cantJugadores; i++) {
                    lista.add(crearJugador(i+1));
                    
                }    
            }
           
        } while (cantJugadores < 1 || cantJugadores > 6);

         return lista; 
    }
    
    public boolean disparo (Revolver r1, Jugador j1){
        
        RevolverServices rs = new RevolverServices();
        
        /*
        System.out.println("Jugador: " + j1.getNombre());
        System.out.println("Posicion actual: " + r1.getPosicionActual());
        System.out.println("Posicion del agua: " + r1.getPosicionAgua());
        System.out.println("==========================");
        */
        
        if(rs.mojar(r1)){
            j1.setMojado(true);
            return true;
        } else {
              rs.siguienteChorro(r1);
            return false;
        }
        
    }
    
    
   
}
