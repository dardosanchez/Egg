
package Principal;

import Entidad.Cursos;
import Servicios.CursosService;


public class Principal {

    
    public static void main(String[] args) {
        
        CursosService cs = new CursosService();
        
        Cursos curso1 = cs.crearCurso();
        
        System.out.println("La ganancia semanal es $" + cs.calcularGananciaSemanal(curso1));
        
    }
    
}
