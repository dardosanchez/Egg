
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;


public class FabricanteServices {
    
    private FabricanteDAO dao;
      
    public FabricanteServices() {
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante () {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("____ NUEVO FABRICANTE ____");
        System.out.print("- Nombre del Fabricante: ");
        String nombre = entrada.nextLine();
        
        try {
            // Valido el nombre
            if(nombre==null || nombre.trim().isEmpty()){
                throw new Exception("Se debe ingresar un nombre");
            }
            
            // Creo el Fabricante 
            Fabricante fabricante =  new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
            
            System.out.println("");
            System.out.println("======================================");
            System.out.println("=  FABRICANTE AGREGADO CORRECTAMENTE  ");
            System.out.println("======================================");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
   
    
}
