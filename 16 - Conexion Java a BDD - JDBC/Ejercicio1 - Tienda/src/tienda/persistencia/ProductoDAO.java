package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }

            String sql = "INSERT INTO Producto (nombre,precio,codigo_fabricante)"
                    + "VALUES ('" + producto.getNombre() + "' , '" + producto.getPrecio()
                    + "' , '" + producto.getCodigoFabricante() + "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto para modificar");
            }

            String sql = "UPDATE Producto SET "
                    + "nombre= '" + producto.getNombre() 
                    + "' , precio= " + producto.getPrecio() 
                    + " , codigo_fabricante= "
                    + producto.getCodigoFabricante() 
                    + " WHERE codigo= " + producto.getCodigo() + ";";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarProducto(Producto producto) throws Exception {

        try {

            String sql = "DELETE FROM Producto WHERE codigo = '" + producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }

    }

    public ArrayList<String> ListarNombresDeProductos() throws Exception {

        try {
            String sql = "SELECT nombre FROM Producto";

            consultarBase(sql);

            String nombreProducto;
            ArrayList<String> listaProductos = new ArrayList<>();

            while (resultado.next()) {
                nombreProducto = resultado.getString(1);
                listaProductos.add(nombreProducto);
            }
            desconectarBase();
            return listaProductos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistemas");
        }

    }

    public ArrayList<Producto> ListarNombreYPrecioDeProducto() throws Exception {

        try {
            String sql = "SELECT nombre, precio FROM Producto";

            consultarBase(sql);

            Producto producto;
            ArrayList<Producto> listaProductos = new ArrayList<>();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                listaProductos.add(producto);
            }
            desconectarBase();
            return listaProductos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistemas");
        }

    }

    public ArrayList<Producto> ListarPorPrecioEntre() throws Exception {

        try {
            String sql = "SELECT * FROM Producto WHERE precio BETWEEN 120 AND 202;";

            consultarBase(sql);

            Producto producto;
            ArrayList<Producto> listaProductos = new ArrayList<>();

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                listaProductos.add(producto);
            }
            desconectarBase();
            return listaProductos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistemas");
        }

    }

    public ArrayList<Producto> ListarPortatiles() throws Exception {

        try {
            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%Portátil%';";

            consultarBase(sql);

            Producto producto;
            ArrayList<Producto> listaProductos = new ArrayList<>();

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                listaProductos.add(producto);
            }
            desconectarBase();
            return listaProductos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistemas");
        }

    }

    public Producto ProductoMasBarato() throws Exception {

        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1;";

            consultarBase(sql);

            Producto producto = new Producto();
            // Avanzo al primer registro
            resultado.next();
            producto.setCodigo(resultado.getInt(1));
            producto.setNombre(resultado.getString(2));
            producto.setPrecio(resultado.getDouble(3));
            producto.setCodigoFabricante(resultado.getInt(4));

            desconectarBase();
            return producto;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistemas");
        }

    }
    
    public Producto buscarProductoXNombre(String nombre) throws Exception {
        
         try {
            String sql = "SELECT * FROM Producto WHERE nombre = '" + nombre + "';";

            consultarBase(sql);

            Producto producto = new Producto();
            // Avanzo al primer registro
            resultado.next();
            producto.setCodigo(resultado.getInt(1));
            producto.setNombre(resultado.getString(2));
            producto.setPrecio(resultado.getDouble(3));
            producto.setCodigoFabricante(resultado.getInt(4));

            desconectarBase();
            return producto;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("No se encontro el producto");
        }
    }
    
}
