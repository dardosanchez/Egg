
package Servicios;

import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.util.Scanner;


public class BarcoServices {
    
    public Barco crearBarco(){
        Scanner entrada = new Scanner(System.in);
        Barco barco = new Barco();
        System.out.println("");
        System.out.println("______ .:SELECCIONE EL BARCO:. ______ ");
        System.out.println("1. Barco                ");
        System.out.println("2. Velero               ");
        System.out.println("3. Barco a Motor        ");
        System.out.println("4. Yate                 ");
        System.out.print("Ingrese una opcion: ");
        int opcion = entrada.nextInt();
        
        
        entrada.nextLine();
        
        System.out.println("");
        switch (opcion) {
            case 1:
                System.out.println("______ .:INGRESE LOS DATOS DEL BARCO:. ______ ");
                break;
            case 2:
                System.out.println("______ .:INGRESE LOS DATOS DEL VELERO:. ______ ");
                break;
            case 3:
                System.out.println("______ .:INGRESE LOS DATOS DEL BARCO A MOTOR:. ______ ");
                break;
            case 4:
                System.out.println("______ .:INGRESE LOS DATOS DEL YATE:. ______ ");
                break;
        }
        
        System.out.print("- Matricula: ");
        String matricula = entrada.nextLine();
        System.out.print("- Eslora: ");
        int eslora = entrada.nextInt();
        System.out.print("- Año de Fabricacion: ");
        int anio = entrada.nextInt();
        

        switch (opcion) {
            case 2:
                System.out.print("- Cantidad de Mastil: ");
                int cantMastil = entrada.nextInt();
                barco = new Velero(cantMastil, matricula, eslora, anio);
                break;
            case 3:
                System.out.print("- Potencia CV: ");
                double potenciaCV = entrada.nextDouble();
                barco = new BarcoMotor(potenciaCV, matricula, eslora, anio);
                break;
            case 4:
                System.out.print("- Potencia CV: ");
                int potencia = entrada.nextInt();
                System.out.print("- Cantidad de Camarotes: ");
                int cantCamarotes = entrada.nextInt();
                barco = new Yate(potencia, cantCamarotes, matricula, eslora, anio);
                break;
            default:
                barco = new Barco(matricula, eslora, anio);
        }
        
        return barco;
    }
    
}
