package Principal;

import Servicios.FechaService;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        
        FechaService fs = new FechaService();

        Date nacimiento = fs.fechaNacimiento();

        System.out.println("Tiene " + (fs.diferencia(nacimiento, fs.fechaActual())) + 
                " años.");
        
    }                                
}
