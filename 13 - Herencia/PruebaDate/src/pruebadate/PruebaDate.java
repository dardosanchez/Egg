
package pruebadate;

import java.util.Date;
import java.util.Scanner;


public class PruebaDate {

        public static void main(String[] args) {
       // Scanner entrada = new Scanner(System.in);

      
        Date fechaAlquiler = new Date(2023,05, 20);
        Date fechaDevolucion = new Date();
        
          
        System.out.println("Fecha Alquiler: ");
        System.out.println(fechaAlquiler.getDate()+"/" + fechaAlquiler.getMonth()+"/"+fechaAlquiler.getYear());
        System.out.println("Fecha Devolucion: ");
        System.out.println(fechaDevolucion.getDate()+"/" + (fechaDevolucion.getMonth()+1)+"/"+(fechaDevolucion.getYear()+1900)); 
    
          
        }
    
        /*
    public void calcularAlquiler ( Date fechaDevolucion, Date fechaAlquiler){
      
        long tiempoAlquilerMillis = fechaDevolucion.getTime() - fechaAlquiler.getTime();
        long tiempoAlquilerDias = tiempoAlquilerMillis / (86400000);
        
        System.out.println("Los dias alquilados son: " + tiempoAlquilerDias);
    }
        */
}