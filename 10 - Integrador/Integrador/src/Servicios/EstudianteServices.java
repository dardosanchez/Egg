package Servicios;

import Entidad.Estudiante;

public class EstudianteServices {

    public double calcularPromedio(Estudiante[] e) {
        double promedio = 0;

        for (int i = 0; i < 8; i++) {
            promedio += e[i].getNota();
        }

        promedio /= 8;

        return promedio;
    }

    public String[] notaAlMayorPromedio(Estudiante[] e) {
        String Arreglo[] = new String[8];
        double prom = calcularPromedio(e);
        int j = 0;

        for (int i = 0; i < 8; i++) {
            if (e[i].getNota() > prom) {
                Arreglo[j] = e[i].getNombre();
                j++;
            }
        }
        return Arreglo;
    }

    public void mostrarEstudiantes(String Arreglo[]) {
        System.out.println("");
        System.out.println("Alumnos que tienen nota mayor al promedio: ");
        for (int i = 0; i < Arreglo.length; i++) {
            if (Arreglo[i] == null || Arreglo[i].isEmpty()) {
                continue; // Saltar a la siguiente iteración si el elemento es nulo o vacío
            }
            System.out.println("- Alumno: " + Arreglo[i]);
        }
        System.out.println("");
    }
}
