
package integrador;

import Entidad.Estudiante;
import Servicios.EstudianteServices;

public class Integrador {

    public static void main(String[] args) {
       
        EstudianteServices es = new EstudianteServices();
        Estudiante ArregloEstudiantes [] = new Estudiante [8];
        
        ArregloEstudiantes[0] = new Estudiante("Dardo",72.5);
        ArregloEstudiantes[1] = new Estudiante("Monica",12.5);
        ArregloEstudiantes[2] = new Estudiante("Leandro",42.5);
        ArregloEstudiantes[3] = new Estudiante("Arnaldo",24.5);
        ArregloEstudiantes[4] = new Estudiante("Carlos",99.4);
        ArregloEstudiantes[5] = new Estudiante("Jeronimo",11.7);
        ArregloEstudiantes[6] = new Estudiante("Thomas",22.4);
        ArregloEstudiantes[7] = new Estudiante("Emilia",41.2);
        
        System.out.println("El promedio de notas es: " + es.calcularPromedio(ArregloEstudiantes));
        
        String ArregloNombres [] = es.notaAlMayorPromedio(ArregloEstudiantes);
        
        es.mostrarEstudiantes(ArregloNombres);
        
      
    }
    
}

