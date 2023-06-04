package Principal;

import Entidad.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        PersonaService serv = new PersonaService();
        Persona persona1 = serv.crearPersona();
        System.out.println("La edad de " + persona1.getNombre() + " es " + serv.calcularEdad(persona1.getFechaNacimiento(), serv.fechaActual()));
        System.out.println("La persona es menor de edad? " + serv.menorQue(persona1, 18));
        serv.mostrarPersona(persona1);

    }
}
