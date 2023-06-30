
package tienda;

import java.util.Scanner;
import tienda.servicios.FabricanteServices;
import tienda.servicios.ProductoServices;


public class tiendaPrincipal {

    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        FabricanteServices fabricanteService = new FabricanteServices();
        ProductoServices productosService = new ProductoServices();
        int opcion;
        
        
        do{
            System.out.println("_________ MENU _________");
            System.out.println("1. Ingresar un Producto");
            System.out.println("2. Mostrar los nombres de los Productos");
            System.out.println("3. Mostrar los nombres y precios de los Productos");
            System.out.println("4. Mostrar las Portatiles");
            System.out.println("5. Mostrar productos entre $120 y $202");
            System.out.println("6. Producto mas Barato");
            System.out.println("7. Editar un Producto");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    productosService.crearProducto();
                    break;
                case 2:
                    productosService.listarNombresDeProductos();
                    break;
                case 3:
                    productosService.listarNombresPreciosDeProductos();
                    break;  
                case 4:
                    productosService.listarPortatiles();
                    break;
                case 5:
                    productosService.listarProductosEntre120Y202();
                    break;
                case 6:
                    productosService.listarMasBarato();
                    break;
                case 7:
                    productosService.editarProducto();
                    break;
                default:
                    if(opcion != 8){
                        System.out.println("Opcion incorrecta. Vuelva a intentarlo...");
                    }   
            }  
            System.out.println("");
            System.out.println("");
            System.out.println("");
        } while(opcion != 8);  
    }
    
}
