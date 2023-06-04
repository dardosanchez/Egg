
package Principal;

import Entidad.Raices;
import Servicios.RaicesServicios;
import java.util.Scanner;

public class Principal {
   
    public static void main(String[] args) {
        Raices raiz1 = new Raices();
        RaicesServicios rs = new RaicesServicios();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar los tres coheficientes: ");
        
        System.out.print("A = ");
        raiz1.setA(entrada.nextDouble());
        
        System.out.print("B = ");
        raiz1.setB(entrada.nextDouble());
        
        System.out.print("C = ");
        raiz1.setC(entrada.nextDouble());
        
        rs.calcular(raiz1);
        
        System.out.println("");
    }
    
}
