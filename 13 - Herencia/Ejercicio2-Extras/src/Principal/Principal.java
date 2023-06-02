
package Principal;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import Servicios.EdificioService;
import Servicios.OficinasServices;
import Servicios.PolideportivoServices;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        
        ArrayList <Edificio> listaEdificio = new ArrayList<>();
        
       
        Polideportivo poli1 = new Polideportivo("Dardo", "Techado", 150, 100, 40);
        Polideportivo poli2 = new Polideportivo("Fernando", "Abierto", 50, 47, 60);
        
        EdificioDeOficinas edi1 = new EdificioDeOficinas(40, 300, 40, 84, 67, 41);
        EdificioDeOficinas edi2 = new EdificioDeOficinas(10, 142, 10, 20, 47, 66);
        
        listaEdificio.add(poli1);
        listaEdificio.add(poli2);
        listaEdificio.add(edi1);
        listaEdificio.add(edi2);

        OficinasServices os = new OficinasServices();
        PolideportivoServices ps = new PolideportivoServices();
        
        
        int poliTechado=0;
        int poliAbierto=0;
        
        for (Edificio aux : listaEdificio) {
            System.out.println("==============================");
            System.out.println("La superficie es " + os.calcularSuperficie(aux));
            System.out.println("El volumen es " +ps.calcularVolumen(aux));
            
            if(aux instanceof Polideportivo){
                if(((Polideportivo) aux).getTipoInst().equals("Techado")){
                    poliTechado++;
                } else {
                    poliAbierto++;
                }
            } else {
                os.cantPersonas();
            }
        }
        
        System.out.println("Cantidad de polideportivos techados: " + poliTechado );
        System.out.println("Cantidad de polideportivos abiertos: " + poliAbierto );
        
    }
    
}
