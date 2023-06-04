
package Principal;

import Entidad.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class Principal {

   
    public static void main(String[] args) {
       
        ParDeNumerosService ps = new ParDeNumerosService();
        
        ParDeNumeros p1 = new ParDeNumeros();
        
        ps.mostrarValores(p1);
        
        System.out.println("El mayor es " + ps.devolverMayor(p1));
        
        System.out.println("Potencia: " + ps.calcularPotencia(p1));
        System.out.println("Raiz: " + ps.calculaRaiz(p1));
    }
    
}
