
package Principal;

import Entidad.Alojamiento;
import Entidad.Hotel;
import Entidad.HotelCuatroEstrella;
import Servicios.AlojamientoServices;
import java.util.ArrayList;

public class PrincipalAlojamiento {
    
    public static void main(String[] args) {
        AlojamientoServices as = new AlojamientoServices();
        
        ArrayList<Alojamiento> listaAlojamiento = new ArrayList<>();
        
        listaAlojamiento.add(new HotelCuatroEstrella(true, "a", "RestaurantDardo", 50, 40, 34, 41, 5000, "HotelDardo", "San Martin 4325", "Santa Fe", "Dardo"));
        as.verAlojamientos(listaAlojamiento);
        
    }
}
