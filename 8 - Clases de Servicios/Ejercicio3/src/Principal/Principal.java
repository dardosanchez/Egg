package Principal;

import Entidad.Persona;
import Servicios.PersonaServicio;

public class Principal {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();

        /*
        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();

        Persona[] personas = {p1, p2, p3, p4};
         */
       
        Persona[] personas = new Persona[4];

        for (int i = 0; i < 4; i++) {
            personas[i] = ps.crearPersona();
        }
          
        ps.calculos(personas);
        
    }

}
