package AlumnoApp;

import Entidad.Alumno;
import Servicios.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoAPP {

    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        AlumnoService as = new AlumnoService();

        as.crearAlumno(alumnos);
        
        System.out.println("========================================");
        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombre = entrada.nextLine();
        
        boolean seEncontro = false;
        for (Alumno aux : alumnos) {
            if (aux.getNombre().equals(nombre)) {
                System.out.println("El promedio de notas de " + aux.getNombre() + " es " + as.notaFinal(aux.getNotas()));
                seEncontro = true;
                break;
            }
        }
        
        if(!seEncontro){
            System.out.println("El alumno '" + nombre + "' no se a encontrado");
        }
        
        System.out.println("");
    }
}
