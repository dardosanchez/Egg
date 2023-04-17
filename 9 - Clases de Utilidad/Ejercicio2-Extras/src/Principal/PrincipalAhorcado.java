
package Principal;

import Entidad.Ahorcado;
import Servicios.AhorcadoService;


public class PrincipalAhorcado {
    
    public static void main(String[] args) {
        
        AhorcadoService as = new AhorcadoService();
        
        Ahorcado jugador1 = new Ahorcado();
        
        as.juego(jugador1);
        
    }
    
}
