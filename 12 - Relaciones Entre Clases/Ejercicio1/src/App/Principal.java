
package App;

import Entidad.Perro;
import Entidad.Persona;


public class Principal {

    
    public static void main(String[] args) {
        
    
        
        Perro perro1 = new Perro("Homero", "Doberman", 12, "Grande");
        Perro perro2 = new Perro("Astrid", "Caniche", 5, "Chico");
        
        Persona p1 = new Persona("Dardo", "Sanchez", 22, 45515451, perro1);
        Persona p2 = new Persona("Lucas", "Jurado", 26, 12454878, perro2);
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
    }
    
}
