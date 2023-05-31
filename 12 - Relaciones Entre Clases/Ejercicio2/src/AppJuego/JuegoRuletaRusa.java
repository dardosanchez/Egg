
package AppJuego;

import Entidad.Juego;
import Entidad.Revolver;
import Servicios.JugadorServices;
import Servicios.RevolverServices;



public class JuegoRuletaRusa {

    
    public static void main(String[] args) {
       
        JugadorServices js = new JugadorServices();

        Revolver r = new Revolver();

        Juego juego = new Juego(js.crearJugadores(), r);
        
        juego.ronda(r);
        
    }
    
}
