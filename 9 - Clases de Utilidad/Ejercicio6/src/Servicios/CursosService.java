
package Servicios;

import Entidad.Cursos;
import java.util.Scanner;


public class CursosService {
    
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    
    public String [] cargarAlumnos(Cursos c1){
        
        System.out.println("Ingresar los nombres de los alumnos:");
        String [] auxAlumnos = new String [5];
        
        entrada.nextLine(); // Limpio el Buffer
        
        for(int i=0;i<c1.getAlumnos().length;i++){
            System.out.print("Alumno N° " + (i+1) + ": ");
            auxAlumnos[i] = entrada.nextLine();
        }
           
        return auxAlumnos;
    }
    
    public Cursos crearCurso(){
        System.out.println(".: Datos del Curso :.   ");
        
        System.out.print("- Nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("- Cantidad de horas por dia: ");
        double cantidadHoras = entrada.nextDouble();
        
        System.out.print("- Cantidad de dias por semana: ");
        int cantidadDias = entrada.nextInt();
        
        System.out.print("- Turno (M/T): ");
        char turno  = entrada.next().charAt(0);
        turno = Character.toUpperCase(turno);
        
        System.out.print("- Precio por hora: $");
        double precio = entrada.nextDouble();
        
        Cursos c1 = new Cursos(nombre, cantidadHoras, cantidadDias, turno, precio);
        
        c1.setAlumnos(cargarAlumnos(c1));
        
        return c1;
        
    }
    
    public double calcularGananciaSemanal (Cursos c1){
        
        return c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getAlumnos().length * c1.getCantidadDiasPorSemana();
        
    }
    
}
