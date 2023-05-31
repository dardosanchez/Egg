
package Servicios;

import Entidad.Electrodomestico;
import java.util.Scanner;


public class ElectrodomesticoService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Electrodomestico crearElectrodomestico (){
        
        System.out.print("- Precio: ");
        double precio = entrada.nextDouble();
        
        if(precio<1000){
            precio = 1000;
        }
        
        entrada.nextLine();
        
        System.out.print("- Color: ");
        String color = entrada.nextLine();
        System.out.print("- Consumo: ");
        char consumo = entrada.nextLine().charAt(0);
        System.out.print("- Peso: ");
        double peso = entrada.nextDouble();
        
        return new Electrodomestico (precio, color, consumo, peso);
    }
    
    public void precioFinal (Electrodomestico e ){
        
        switch (e.getConsumo()) {
            case 'A':
                e.setPrecio(e.getPrecio()+1000);
                break;
            case 'B':
                e.setPrecio(e.getPrecio()+800);
                break;
            case 'C':
                e.setPrecio(e.getPrecio()+600);
                break;
            case 'D':
                e.setPrecio(e.getPrecio()+500);
                break;
            case 'E':
                e.setPrecio(e.getPrecio()+300);
                break;
            case 'F':
                e.setPrecio(e.getPrecio()+100);
                break;
        }
        
        if(e.getPeso()>=1 && e.getPeso()<=19){
            e.setPrecio(e.getPrecio()+100);
        } else {
            if(e.getPeso()>=20 && e.getPeso()<=49){
                e.setPrecio(e.getPrecio()+500);
            } else {
                if(e.getPeso()>=50 && e.getPeso()<=79){
                    e.setPrecio(e.getPrecio()+800);
                } else {
                    if (e.getPeso()>=80){
                        e.setPrecio(e.getPrecio()+1000);
                    }
                }
            }
        }
        
        
    }
}
