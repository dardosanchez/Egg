package Servicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner entrada = new Scanner(System.in);

    public void crearAlumno(ArrayList<Alumno> alumnos) {
        char respuesta;
        do {

            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();

            ArrayList<Integer> notas = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.print("Nota N°" + (i + 1) + ": ");
                Integer nota = entrada.nextInt();         
                notas.add(nota);
            }
           
            alumnos.add(new Alumno(nombre, notas));
            entrada.nextLine();  // LIMPIO EL BUFFER
            System.out.print("Desea ingresar otro alumno? (S/N)" );
            respuesta = entrada.nextLine().charAt(0);
            respuesta = Character.toUpperCase(respuesta);
            
        } while (respuesta != 'N');
    }

    public double notaFinal(ArrayList<Integer> notas) {
        double promedio = 0;
        for (Integer aux : notas) {
            promedio += aux;
        }
        return promedio / notas.size();
    }

}
