
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
            System.out.println("2. Ingresar un Fabricante");
            System.out.println("3. Mostrar los nombres de los Productos");
            System.out.println("4. Mostrar los nombres y precios de los Productos");
            System.out.println("5. Mostrar las Portatiles");
            System.out.println("6. Mostrar productos entre $120 y $202");
            System.out.println("7. Producto mas Barato");
            System.out.println("8. Editar un Producto");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    productosService.crearProducto();
                    break;
                case 2:
                    fabricanteService.crearFabricante();
                    break;
                case 3:
                    productosService.listarNombresDeProductos();
                    break;
                case 4:
                    productosService.listarNombresPreciosDeProductos();
                    break;  
                case 5:
                    productosService.listarPortatiles();
                    break;
                case 6:
                    productosService.listarProductosEntre120Y202();
                    break;
                case 7:
                    productosService.listarMasBarato();
                    break;
                case 8:
                    productosService.editarProducto();
                    break;
                default:
                    if(opcion != 9){
                        System.out.println("Opcion incorrecta. Vuelva a intentarlo...");
                    }   
            }  
            System.out.println("");
            System.out.println("");
            System.out.println("");
        } while(opcion != 9);  
    }
    
}
