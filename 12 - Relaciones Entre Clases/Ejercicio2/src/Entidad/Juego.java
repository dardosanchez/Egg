
package Entidad;

import Servicios.JugadorServices;
import Servicios.RevolverServices;
import java.util.ArrayList;


public class Juego {
    private ArrayList<Jugador> listaJugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> listaJugadores, Revolver revolver) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    
    public void ronda(Revolver r1){
        boolean bandera=false;
     
        RevolverServices rs = new RevolverServices(); 
        JugadorServices js = new JugadorServices();
        
        rs.llenarRevolver(r1);
        
        Jugador ganador = new Jugador();
        while(!bandera){
            
            for (Jugador aux : listaJugadores) {
                bandera = js.disparo(revolver, aux);
                
                if(bandera){   
                    ganador = aux;
                    bandera = true;
                    break;
                }
            }    
        }
        
        System.out.println("El jugador mojado es " + ganador.getNombre() + " " + ganador.getId() + "!!");
       
    }
    
}
