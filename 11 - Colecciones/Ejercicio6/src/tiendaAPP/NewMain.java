package tiendaAPP;

import Servicios.TiendaServices;
import java.util.HashMap;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<String, Double> map = new HashMap<>();

        TiendaServices ts = new TiendaServices();

        int respuesta;

        do {

            System.out.println("========================================");
            System.out.println("1 - Agregar Producto");
            System.out.println("2 - Modificar Precio");
            System.out.println("3 - Eliminar Producto");
            System.out.println("4 - Mostrar lista productos");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opcion: ");
            
            
            
            respuesta = entrada.nextInt();
            respuesta = ts.validarOpcion(respuesta);
            entrada.nextLine(); // LIMPIA EL BUFFER
            System.out.println("");
            
            switch (respuesta) {
                case 1:
                    ts.agregarProducto(map);
                    System.out.println("Producto/s agregado/s correctamente.");
                    break;
                case 2:
                    ts.modificarPrecio(map);
                    break;
                case 3:
                    ts.eliminarProducto(map);
                    break;
                case 4:
                    ts.mostrarProductos(map);
                    break;
                case 5:
                    System.out.println("SALIENDO DEL PROGRAMA...");
                    break;
            }
           
            System.out.println("");
        } while (respuesta != 5);

    }

}
