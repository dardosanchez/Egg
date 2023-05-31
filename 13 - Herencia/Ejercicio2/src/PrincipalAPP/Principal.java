
package PrincipalAPP;

import Entidad.Lavadora;
import Entidad.Televisor;
import Servicios.LavadoraService;
import Servicios.TelevisorService;

public class Principal {

    public static void main(String[] args) {
        
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        
        System.out.println(" .: LAVADORA :.  ");
        Lavadora lavadora = ls.crearLavadora();
        
        System.out.println(" .: TELEVISOR :.  ");
        Televisor tele = ts.crearTelevisor();
        
        
        ls.precioFinal(lavadora);
        ts.precioFinal(tele);
        
        System.out.println("===============================");
        System.out.println("            DATOS              ");
        System.out.println("===============================");
        System.out.print("        .: Lavadora:.          ");
        System.out.println(lavadora.toString());
        
        System.out.println("");
        System.out.println("===============================");
        System.out.print("        .: Televisor:.         ");
        System.out.println(tele.toString());
            
    }
    
    
}
