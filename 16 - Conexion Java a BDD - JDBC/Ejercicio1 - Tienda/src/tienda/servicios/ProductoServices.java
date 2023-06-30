
package tienda.servicios;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;


public class ProductoServices {
    
    private ProductoDAO dao;
    
    public ProductoServices(){
        this.dao = new ProductoDAO();
    }
    
    public void crearProducto () {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("____ NUEVO PRODUCTO ____");
        System.out.print("- Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("- Precio: ");
        Double precio = entrada.nextDouble();
        System.out.print("- Num. De Fabricante: ");
        int numFabricante = entrada.nextInt();
        
        try {
            // Valido el nombre
            if(nombre==null || nombre.trim().isEmpty()){
                throw new Exception("Se debe ingresar un nombre");
            }
            // Valido el precio
            if(precio<=0){
                throw new Exception("Se debe ingresar un precio mayor/igual a 1");
            }
            // Valido el numFabricante
            if(numFabricante<=0){
                throw new Exception("Se debe ingresar un precio mayor/igual a 1");
            }
            
            
            // Creo el Producto 
            Producto producto =  new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(numFabricante);
            
            dao.guardarProducto(producto);
            
            
            System.out.println("======================================");
            System.out.println("=   PRODUCTO AGREGADO CORRECTAMENTE  =");
            System.out.println("======================================");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
    
    public void listarNombresDeProductos (){
        try {
            ArrayList<String> listaProducto = dao.ListarNombresDeProductos();
            System.out.println("");
            System.out.println("____ NOMBRES DE LOS PRODUCTOS ____");
            
            for (String aux : listaProducto) {
                System.out.println("- " + aux);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ProductoServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarNombresPreciosDeProductos(){
        
        try {
            ArrayList<Producto> listaProducto = dao.ListarNombreYPrecioDeProducto();
            System.out.println("");
            System.out.println("____ NOMBRES Y PRECIO DE LOS PRODUCTOS ____");
            for (Producto producto : listaProducto) {
               System.out.println("- Nombre: " + producto.getNombre());
               System.out.println("- Precio: $" + producto.getPrecio());
               System.out.println("- - - - - - - - - - - - - - - - - - - -");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ProductoServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarProductosEntre120Y202 (){
        try {
            ArrayList<Producto> listaProducto = dao.ListarPorPrecioEntre();
            
            System.out.println("");
            System.out.println("____ PRODUCTOS ENTRE $120 Y $202 ____");
            
            for (Producto producto : listaProducto) {
               System.out.println("- Nombre: " + producto.getNombre());
               System.out.println("- Precio: $" + producto.getPrecio());
               System.out.println("- Cod. de Fabricante: " + producto.getCodigoFabricante());
               System.out.println("- - - - - - - - - - - - - - - - - - - -");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ProductoServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarPortatiles () {
        try {
            ArrayList<Producto> listaProducto = dao.ListarPortatiles();
            
            System.out.println("");
            System.out.println("____ PORTATILES ____");
            
            for (Producto producto : listaProducto) {
               System.out.println("- Nombre: " + producto.getNombre());
               System.out.println("- Precio: $" + producto.getPrecio());
               System.out.println("- Cod. de Fabricante: " + producto.getCodigoFabricante());
               System.out.println("- - - - - - - - - - - - - - - - - - - -");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ProductoServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarMasBarato() {
        try {
            Producto producto = dao.ProductoMasBarato();

            System.out.println("");
            System.out.println("____ PRODUCTO MAS BARATO ____");

            System.out.println("- Nombre: " + producto.getNombre());
            System.out.println("- Precio: $" + producto.getPrecio());
            System.out.println("- Cod. de Fabricante: " + producto.getCodigoFabricante());

        } catch (Exception ex) {
            Logger.getLogger(ProductoServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarProducto (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("- Ingrese el nombre del producto: ");
        String nombre = entrada.nextLine();
        
        try {
            Producto productoBuscado = dao.buscarProductoXNombre(nombre);
            System.out.println("");
            System.out.println("");
            System.out.println("_____ MODIFICAR DATOS _____");
            System.out.println("- Nombre Actual: " + productoBuscado.getNombre());
            System.out.print("- Nuevo Nombre: ");
            String nuevoNombre = entrada.nextLine();
            System.out.println("- Precio Actual: " + productoBuscado.getPrecio());
            System.out.print("- Nuevo Precio: ");
            Double nuevoPrecio = entrada.nextDouble();
            System.out.println("- Cod. Fabricante Actual: " + productoBuscado.getCodigoFabricante());
            System.out.print("- Nuevo Cod. Fabricante: ");
            int nuevoCodigo = entrada.nextInt();
            
            productoBuscado.setNombre(nuevoNombre);
            productoBuscado.setPrecio(nuevoPrecio);
            productoBuscado.setCodigoFabricante(nuevoCodigo);
            
            dao.modificarProducto(productoBuscado);
            
            System.out.println("======================================");
            System.out.println("=  PRODUCTO MODIFICADO CORRECTAMENTE  ");
            System.out.println("======================================");
            
        } catch (Exception ex) {
            System.out.println("No se encontro el producto");
            Logger.getLogger(ProductoServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
