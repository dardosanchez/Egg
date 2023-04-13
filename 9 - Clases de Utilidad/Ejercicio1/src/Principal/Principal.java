
package Principal;

import Entidad.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        
        CadenaServicio cs = new CadenaServicio();
        Scanner entrada = new Scanner (System.in).useDelimiter("\n");
        
        
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        Cadena c1 = new Cadena(frase);
        
        
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        
       cs.vecesRepetido("a", c1);
        
        System.out.print("Ingrese una nueva frase: ");
        String frase2 = entrada.nextLine();
        
        if(cs.compararLongitud(frase2, c1)){
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
    }
        
        
        cs.unirFrases(frase2, c1);
        cs.reemplazar("$", c1);
        
        if(cs.contiene("a", c1)){
            System.out.println("La frase contiene " + "a");
        } else{
            System.out.println("La frase no contiene " + "a");
        }
    }
}
