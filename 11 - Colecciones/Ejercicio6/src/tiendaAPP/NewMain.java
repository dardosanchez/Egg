
package tiendaAPP;

import Servicios.TiendaServices;
import java.util.HashMap;


public class NewMain {

    
    public static void main(String[] args) {
        
        HashMap<String, Double> map = new HashMap<>();
        
        TiendaServices ts = new TiendaServices();
        
        ts.agregarProducto(map);
        ts.modificarPrecio(map);
        
        ts.mostrarProductos(map);
        ts.eliminarProducto(map);
        
        ts.mostrarProductos(map);
    }
    
}
