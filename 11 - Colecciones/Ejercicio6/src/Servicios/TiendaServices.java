
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServices {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public void agregarProducto(HashMap<String, Double> map) {

        char respuesta;
        do {
        //    entrada.nextLine(); // LIMPIA EL BUFFER
            System.out.print("- Nombre del producto: ");
            String nombre = entrada.nextLine();
            
            System.out.print("- Precio: $");
            Double precio = entrada.nextDouble();

            map.put(nombre, precio);
            
            entrada.nextLine(); // LIMPIA EL BUFFER
            
            System.out.print("Desea ingresar otro producto? (S/N) ");
            respuesta = entrada.nextLine().charAt(0);
            respuesta = Character.toUpperCase(respuesta);
            System.out.println("");
            
        } while (respuesta != 'N');

    }

    public void modificarPrecio(HashMap<String, Double> mapTienda) {

        if (mapTienda.isEmpty()) {
            System.out.println("LA LISTA SE ENCUENTRA VACIA. AGREGUE PRODUCTOS");
        } else {
            
            System.out.print("Que producto desea modificarle el precio? ");
            String nombre = entrada.nextLine();

            if (mapTienda.containsKey(nombre)) {
                System.out.print("Valor a modificar: ");
                Double valor = entrada.nextDouble();

                mapTienda.put(nombre, valor);
                System.out.println("Precio modificado correctamente.");
            } else {
                System.out.println("El producto no se encontro");
            }
        }

    }

    public void mostrarProductos(HashMap<String, Double> mapTienda) {

        if (mapTienda.isEmpty()) {
            System.out.println("LA LISTA SE ENCUENTRA VACIA. AGREGUE PRODUCTOS");
        } else {

            for (Map.Entry<String, Double> aux : mapTienda.entrySet()) {
                String key = aux.getKey();
                Double valor = aux.getValue();

                System.out.println("Producto: " + key + " ->  Valor: " + valor);
            }
        }

    }

    public void eliminarProducto(HashMap<String, Double> mapTienda) {

        if (mapTienda.isEmpty()) {
            System.out.println("LA LISTA SE ENCUENTRA VACIA. AGREGUE PRODUCTOS");
        } else {
           
            System.out.print("Ingrese le producto a eliminar: ");
            String producto = entrada.nextLine();

            mapTienda.remove(producto);
            System.out.println("Producto eliminado correctamente.");
            System.out.println("");
            
        }

    }

    public int validarOpcion(int numero) {

        while (numero != 1 && numero != 2 && numero != 3 && numero != 4 && numero != 5) {
            System.out.println("Opcion ingresada incorrecta. Vuelva a ingresar.");
            System.out.print("Ingrese una opcion: ");
            numero = entrada.nextInt();
        }
        
        return numero;
    }
}
