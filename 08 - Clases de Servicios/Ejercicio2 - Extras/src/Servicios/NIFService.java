
package Servicios;

import java.util.Scanner;
import Entidad.NIF;

public class NIFService {
    
    NIF numero = new NIF();

    public void crearNif(){
        Scanner entrada = new Scanner(System.in);
        
        long dni;
        char letra;
        
        System.out.print("Ingrese el DNI: ");
        dni = entrada.nextLong();
        letra = calcularLetra(dni % 23);
        numero.DNI = dni;
        numero.Letra = letra;
     
    }
    
    public char calcularLetra(long resto){
        
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N','J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[(int) resto];
    }
    
    public void mostrar(){
     //   System.out.println(numero.DNI + "-" + numero.Letra);
        String nif = String.format("%08d", numero.DNI) + "-" + Character.toUpperCase(numero.Letra);
        System.out.println(nif);

    }    
}
