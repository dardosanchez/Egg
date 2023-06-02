
package Principal;

import Entidad.Alquiler;
import Servicios.AlquilerServices;


public class Ejercicio1Extras {

    
    public static void main(String[] args) {

        AlquilerServices as = new AlquilerServices();
        
        Alquiler alquiler1 = as.crearAlquiler();
        
        alquiler1.mostrarResumenAlquiler();
  
    }
    
}
