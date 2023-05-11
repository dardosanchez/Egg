package principalJugador;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;


public class principalJugador {

    
    public static void main(String[] args) {
       
        
        ArrayList <Jugador> listaequipo1 = new ArrayList();
       
        
        listaequipo1.add(new Jugador("Dardo","Sanchez","Delantero",9));
        listaequipo1.add(new Jugador("Leandro","Chetti","Arquero",9));
        listaequipo1.add(new Jugador("Arnaldo","Almiron","Defensa",9));
        listaequipo1.add(new Jugador("Lionel","Messi","Volante",9));
        
        Equipo e1 = new Equipo("Union", listaequipo1);
        
        for (Jugador aux : e1.getListajug()) {
            System.out.println("==========================");
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Apellido: " + aux.getApellido());
            System.out.println("Posicion: " + aux.getPosicion());
        }
        
        
       
    }
    
}
