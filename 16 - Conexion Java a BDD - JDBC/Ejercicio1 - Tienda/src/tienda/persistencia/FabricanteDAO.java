
package tienda.persistencia;

import tienda.entidades.Fabricante;


public final class FabricanteDAO extends DAO{
    
    public void guardarFabricante(Fabricante fabricante) throws Exception {

        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            String sql = "INSERT INTO Fabricante (nombre)"
                    + "VALUES ('" + fabricante.getNombre() + "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricante(Fabricante fabricante) throws Exception{
        
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante para modificar");
            }

            String sql = "UPDATE Fabricante SET nombre= '" + fabricante.getNombre()
                    + "' WHERE codigo= '" + fabricante.getCodigo() + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void eliminarFabricante (Fabricante fabricante) throws Exception{
        
        try {
            
            String sql = "DELETE FROM Fabricante WHERE codigo = '" + fabricante.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
}
