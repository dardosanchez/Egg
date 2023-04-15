
package Principal;

import Servicios.ArregloService;


public class Principal {
    public static void main(String[] args) {
       
        double [] A = new double [50];
        double [] B = new double [20];
  
        ArregloService as = new ArregloService();
        
        as.inicializarA(A);
        
        as.mostrar(A);
        
        as.ordenar(A);
        
        as.inicializarB(A, B);
        
        as.mostrar(A);
        as.mostrar(B);
        
    }    
}
