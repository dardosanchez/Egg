
package Servicios;

import Entidad.Alquiler;
import Entidad.Barco;
import java.util.Date;
import java.util.Scanner;


public class AlquilerServices {
    
    public Alquiler crearAlquiler () {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("______ .:ALQUILER BARCO:. ______ ");
        System.out.print("- Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("- DNI: ");
        int dni = entrada.nextInt();
        System.out.println("- Fecha de alquiler");
        System.out.print("Dia: ");
        int dia = entrada.nextInt();
         System.out.print("Mes: ");
        int mes = entrada.nextInt();
         System.out.print("Año: ");
        int anio = entrada.nextInt();
        Date fechaAlquiler = new Date(anio, mes,dia );
        System.out.print ("Lo devolvio hoy? (S/N) ");
        char respuesta = entrada.next().charAt(0);
        respuesta = Character.toUpperCase(respuesta);
        Date fechaDevolucion = new Date();
        fechaDevolucion.setDate(fechaDevolucion.getDate());
        fechaDevolucion.setMonth((fechaDevolucion.getMonth()+1));
        fechaDevolucion.setYear((fechaDevolucion.getYear()+1900));
        
        
        
        if (respuesta == 'N') {
            System.out.println("- Fecha de devolucion");
            System.out.print("Dia: ");
            int dia1 = entrada.nextInt();
            System.out.print("Mes: ");
            int mes1 = entrada.nextInt();
            System.out.print("Año: ");
            int anio1 = entrada.nextInt();
            
            fechaDevolucion = new Date(anio1, mes1, dia1);
        }

        System.out.print("- Posicion de Amarre: ");
        int amarre = entrada.nextInt();
        
        BarcoServices bs = new BarcoServices();
        Barco barcoAlquilado = bs.crearBarco();
        
        
        return new Alquiler(nombre, dni, fechaAlquiler, fechaDevolucion, amarre, barcoAlquilado);
    }
    
}
