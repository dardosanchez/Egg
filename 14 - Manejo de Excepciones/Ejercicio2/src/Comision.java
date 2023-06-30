

import java.util.Scanner;


public class Comision {
    String [] nombreAlumnos = new String[5];

    public Comision() {
    }

    public String[] getNombreAlumnos() {
        return nombreAlumnos;
    }

    public void setNombreAlumnos(String[] nombreAlumnos) {
        this.nombreAlumnos = nombreAlumnos;
    }
    
    public void agregarAlumnos (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("id de Alumno: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        
        try {
            nombreAlumnos[id] = nombre;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Id ingresado incorrecto");
        }
        
    }
}
