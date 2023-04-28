package paisAPP;

import Entidad.Pais;
import Servicios.PaisServices;
import Utilidades.Comparadores;
import java.util.TreeSet;

public class paisAPP {

    public static void main(String[] args) {

        TreeSet<Pais> listaPais = new TreeSet<Pais>(Comparadores.ordenarPaisesAlfa); // Ya se guardan alfabeticamente

        PaisServices ps = new PaisServices();

        ps.agregarPais(listaPais);
        ps.mostrarPaises(listaPais);     
        

        System.out.println("");
        System.out.println("=============================================");
        
        
        ps.eliminarPais(listaPais);
        
    }

}
