
package CantanteApp;

import Entidad.CantanteFamoso;
import Servicios.CantanteServices;
import java.util.HashSet;


public class CantanteAPP {

   
    public static void main(String[] args) {
        
        CantanteServices cs = new CantanteServices();
        HashSet <CantanteFamoso> lista = new HashSet();
        
        cs.Menu(lista);
        
    }
    
}
