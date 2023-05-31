
package JuegoApp;

import Entidad.Baraja;
import Servicios.cartaServices;


public class JuegoApp {

    public static void main(String[] args) {
        cartaServices cs = new cartaServices();
        Baraja mazo = new Baraja();
        
        cs.menuJuego(mazo);
               
        
    }
    
}
