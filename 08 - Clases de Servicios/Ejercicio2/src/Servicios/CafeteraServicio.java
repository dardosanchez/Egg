package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner entrada = new Scanner(System.in);

    // Cafetera cafetera = new Cafetera();
    public void llenarCafetera(Cafetera caf) {
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }

    public void servirTaza(int tamanio, Cafetera caf) {

        if (caf.getCantidadActual() == 0) {
            System.out.println("No hay café en la cafetera");
        } else {
            if (caf.getCantidadActual() >= tamanio) {
                caf.setCantidadActual(caf.getCantidadActual() - tamanio);
                System.out.println("Se ha llenado la taza");
            } else {
                double cafeServido = caf.getCantidadActual();
                caf.setCantidadActual(0);
                System.out.println("La taza no se ha llenado completamente, quedan " + (tamanio - cafeServido) + " ml de café");
            }
        }
    }

    public void vaciarCafetera(Cafetera caf){
        caf.setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidad, Cafetera caf){
        
        if(cantidad+caf.getCantidadActual() <= caf.getCapacidadMaxima()){
            caf.setCantidadActual(caf.getCantidadActual()+cantidad);
        } else {
            System.out.println("No se puede agregar cafe. Sobrepasa la capacidad");
        }
        
    }
}
