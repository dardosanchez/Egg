
package PrincipalAPP;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;



public class Principal {

    public static void main(String[] args) {
        double suma=0;
       
        ArrayList<Electrodomestico> listaElectro = new ArrayList<Electrodomestico>();
        
        listaElectro.add(new Lavadora(58, 5000, "Rojo", 'A', 57));
        listaElectro.add(new Televisor(65, true, 15000, "Blanco", 'A', 67));
        listaElectro.add(new Lavadora(91, 15400, "Verde", 'F', 88));
        listaElectro.add(new Televisor(34, false, 6000, "Negro", 'C', 48));
        
        for (Electrodomestico aux : listaElectro) {
            System.out.println("- Precio: " + aux.getPrecio());
            suma += aux.getPrecio();
        }
        
        System.out.println("- La suma de todos los Electrodomesticos es $" + suma);
        
        /*
        System.out.println("===============================");
        System.out.println("            DATOS              ");
        System.out.println("===============================");
        System.out.print("        .: Lavadora:.          ");
        System.out.println(lavadora.toString());
        
        System.out.println("");
        System.out.println("===============================");
        System.out.print("        .: Televisor:.         ");
        System.out.println(tele.toString());
        */
    }
    
    
}
