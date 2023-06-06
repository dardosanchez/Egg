
package Principal;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.ExtraHotel;
import Entidad.Hotel;
import Entidad.HotelCincoEstrellas;
import Entidad.HotelCuatroEstrella;
import Entidad.Recidencia;
import Servicios.AlojamientoServices;
import java.util.ArrayList;

public class PrincipalAlojamiento {
    
    public static void main(String[] args) {
        AlojamientoServices as = new AlojamientoServices();
        
        ArrayList<Alojamiento> listaAlojamiento = new ArrayList<>();
        
        listaAlojamiento.add(new HotelCuatroEstrella(true, "a", "RestaurantDardo", 50, 40, 34, 41, 5000, "HotelDardo", "San Martin 4325", "Santa Fe", "Dardo Sanchez"));
        listaAlojamiento.add(new HotelCincoEstrellas(10, 5, 10, true, "B", "Pepe", 60, 57, 47, 66, 12041, "Hotel Santa Fe", "Bv Pelegrini 3232", "Santo Tome", "Juan Lezcano"));
        listaAlojamiento.add(new Hotel(33, 26, 27, 3547, "Hotel Mirador", "Av Lopez Y Planes 4213", "Santa Fe", "Luis Spahn"));
        listaAlojamiento.add(new Recidencia(30, true, true, true, 50, "SaitSat", "Sarmiento 2122", "Esperanza, Santa Fe", "Luis Mino"));
        listaAlojamiento.add(new Camping(11, 5, false, true, 43, "Camping Santo Tome", "Saavedra 4231", "Santo Tome", "Municipalidad de Santo Tome"));
        listaAlojamiento.add(new ExtraHotel(false, 14, "Pancho", "Alma fuerte 3213", "Franck, Santa Fe", "Dardo Sanchez"));
        listaAlojamiento.add(new Alojamiento("Alojamiento Coki", "Obispo Gelabert 2321", "Rafaela", "Pichichu"));
        
        System.out.println(" .:LISTA DE ALOJAMIENTOS:. ");
        as.verAlojamientos(listaAlojamiento);
        
    }
}
