
package Servicios;

import Entidad.Edificio;
import java.util.Scanner;


public class OficinasServices extends EdificioService {
    
    public void cantPersonas (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantas personas entran en cada oficina? ");
        int cantP = entrada.nextInt();
        System.out.print("Cuantas oficinas hay? ");
        int cantO = entrada.nextInt();
        System.out.print("Cantidad de pisos: ");
        int cantPisos = entrada.nextInt();
        
        System.out.println("La cantidad de personas que entran en un piso: " + cantP );
        System.out.println("La cantidad de personas que entran en el edificio: " + cantP*cantO*cantPisos );
    }

    @Override
    public double calcularSuperficie(Edificio e) {
    //    EdificioDeOficinas eo = (EdificioDeOficinas) e;
        return e.getAncho()*e.getLargo();
    }

    @Override
    public double calcularVolumen(Edificio e) {
        return e.getAlto()*e.getAncho()*e.getLargo();
    }
    
}
