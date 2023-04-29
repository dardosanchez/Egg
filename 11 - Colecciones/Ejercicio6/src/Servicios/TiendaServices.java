
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServices {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public void agregarProducto(HashMap<String, Double> map) {

        char respuesta;
        do {
            System.out.print("- Nombre del producto: ");
            String nombre = entrada.nextLine();

            System.out.print("- Precio: $");
            Double precio = entrada.nextDouble();

            map.put(nombre, precio);
            
            entrada.nextLine(); // LIMPIA EL BUFFER
            
            System.out.print("Desea ingresar otro producto? (S/N)");
            respuesta = entrada.nextLine().charAt(0);
            respuesta = Character.toUpperCase(respuesta);
            
        } while (respuesta != 'N');

    }
    
    public void modificarPrecio (HashMap<String, Double> mapTienda){
        
        System.out.print("Que producto desea modificarle el precio? ");
        String nombre = entrada.nextLine();
        
        if(mapTienda.containsKey(nombre)){
           System.out.print("Valor a modificar: ");
           Double valor = entrada.nextDouble();
           
           mapTienda.put(nombre,valor);
           
        } else {
            System.out.println("El producto no se encontro");
        }
    
    }
    
    public void mostrarProductos (HashMap<String, Double> mapTienda){
        
        for (Map.Entry<String,Double> aux : mapTienda.entrySet()) {
            String key = aux.getKey();
            Double valor = aux.getValue();
            
            System.out.println("Producto: " + key + " ->  Valor: " + valor);
        }
        
    }
    
    public void eliminarProducto (HashMap<String, Double> mapTienda){
        
        entrada.nextLine(); // LIMPIA EL BUFFER
        System.out.print("Ingrese le producto a eliminar: ");
        String producto = entrada.nextLine();
        
        
        mapTienda.remove(producto);
        
        System.out.println("");
        
    }
    
}
