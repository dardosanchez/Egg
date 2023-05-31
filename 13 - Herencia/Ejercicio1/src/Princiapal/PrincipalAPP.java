
package Princiapal;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;


public class PrincipalAPP {

   
    public static void main(String[] args) {
       
      // Declaracion del objeto Perro
      Animal perro1 = new Perro("Stich","carne", 15, "Doberman");
      perro1.Alimentarse();   // Polimorfismo
      
      // Declaracion de otro objeto Perro
      Animal perro2 = new Perro ("Teddy","Croquetas",10,"Chihuahua");
      perro2.Alimentarse();
      
      // Declaracion del objeto Gato
      Animal gato1 = new Gato("Pelusa","Galletas",15,"Siamés");
      gato1.Alimentarse();
      
      // Declaracion del objeto Gato
      Animal caballo1 = new Caballo ("Spark","Pasto",25,"Fino");
      caballo1.Alimentarse();
    }
    
}
