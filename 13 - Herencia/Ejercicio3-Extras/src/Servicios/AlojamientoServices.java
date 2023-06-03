
package Servicios;

import Entidad.Alojamiento;
import java.util.ArrayList;


public class AlojamientoServices {
    
    public void verAlojamientos (ArrayList<Alojamiento> listaAlojamiento){
        
        for (Alojamiento alojamiento : listaAlojamiento) {
            System.out.println(alojamiento.toString());
        }
        
    }
    
}
