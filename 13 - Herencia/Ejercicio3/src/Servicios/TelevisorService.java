
package Servicios;

import Entidad.Electrodomestico;
import Entidad.Televisor;
import java.util.Scanner;


public class TelevisorService extends ElectrodomesticoService{
    
    public Televisor crearTelevisor (){
        Scanner entrada = new Scanner(System.in);
        Electrodomestico e = crearElectrodomestico();
        boolean sintonizador = false;
        
        System.out.print("- Resolucion (pulgadas): ");
        int resolucion = entrada.nextInt();
        System.out.print("- Posee sintonizador TDT? (S/N): ");
        char resp = entrada.next().charAt(0);
        resp = Character.toUpperCase(resp);
        
        switch(resp){
            case 'S':
                sintonizador = true;
                break;
            case 'N':
                sintonizador = false;
                break;
        }
        
        return new Televisor(resolucion, sintonizador, e.getPrecio(), e.getColor(), e.getConsumo(), e.getPeso());
    }
    
    public void precioFinal(Televisor tele){
        super.precioFinal(tele);
        if(tele.getResolucion()>40){
            tele.setPrecio(tele.getPrecio()*1.30);
        }
        if(tele.isSintonizadorTDT()){
            tele.setPrecio(tele.getPrecio()+500);
        }
    }
    
}
