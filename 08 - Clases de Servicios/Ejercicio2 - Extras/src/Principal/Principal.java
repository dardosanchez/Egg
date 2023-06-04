
package Principal;

import Servicios.NIFService;


public class Principal {
    
     public static void main(String[] args) {
        
        NIFService nif = new NIFService();
        nif.crearNif();
        nif.mostrar();
        
    }
    
}
