
package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona (){
        System.out.print("- Nombre: ");
        String nombre = entrada.nextLine();
        Date nacimiento = fechaNacimiento();
        
        
        return new Persona(nombre,nacimiento);
         
    }
    
    public Date fechaNacimiento() {
        int aa, mm, dd;
        System.out.print("Ingrese anio de nacimiento (aaaa): ");
        aa = entrada.nextInt();
        System.out.print("Ingrese mes de nacimiento (mm): ");
        mm = entrada.nextInt();
        System.out.print("Ingrese dia de nacimiento (dd): ");
        dd = entrada.nextInt();
        return new Date(aa-1900, mm-1, dd); //Utilizar -1900 para fechas en 4 digitos
    }
    
       public Date fechaActual() {
        return new Date();
    }

    public int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth() < fechaNacimiento.getMonth()) {
            edad--;
        } else if (fechaActual.getMonth() == fechaNacimiento.getMonth() && fechaActual.getDay() < fechaNacimiento.getDay()) {
            edad--;
        }
        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona.getFechaNacimiento(), fechaActual()) < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre de la persona: " + persona.getNombre() + 
                "\nFecha de nacimiento: " + persona.getFechaNacimiento().getDay() +
                "/" + persona.getFechaNacimiento().getMonth() + 
                "/" + persona.getFechaNacimiento().getYear());
    }

}
