
package Principal;

import Entidad.DNI;
import Entidad.Persona;

public class PrincipalPersona {

    public static void main(String[] args) {

        DNI dni1 = new DNI('S', 42272167);
        Persona p1 = new Persona("Dardo", "Sanchez", dni1);

        DNI dni2 = new DNI('M', 15846244);
        Persona p2 = new Persona("Leandro", "Sanchez", dni2);

        DNI dni3 = new DNI('F', 45114637);
        Persona p3 = new Persona("Arnaldo", "Sanchez", dni3);

        System.out.println("Nombre: " + p1.getNombre() + " " + p1.getApellido());
        System.out.println("DNI: " + dni1.getSerie() + " " + dni1.getNumero());

        System.out.println("Nombre: " + p2.getNombre() + " " + p2.getApellido());
        System.out.println("DNI: " + dni2.getSerie() + " " + dni2.getNumero());

        System.out.println("Nombre: " + p3.getNombre() + " " + p3.getApellido());
        System.out.println("DNI: " + dni3.getSerie() + " " + dni3.getNumero());
    }

}
