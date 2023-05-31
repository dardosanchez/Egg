
package Servicios;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import java.util.Scanner;


public class LavadoraService extends ElectrodomesticoService {
    Scanner entrada = new Scanner(System.in);
    
    public Lavadora crearLavadora (){
        
        Electrodomestico e = crearElectrodomestico();
        
        System.out.print("- Carga: ");
        double carga = entrada.nextDouble();
        
        
        return new Lavadora(carga, e.getPrecio(), e.getColor(), e.getConsumo(), e.getPeso());
    }

  
    
    public void precioFinal(Lavadora l) {
        
        super.precioFinal(l);
        if(l.getCarga() > 30){
            l.setCarga(l.getCarga()+500);
        }
    }
    
    
    
    
}
