

package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase terminada en punto: ");
        frase = entrada.nextLine();
        
        System.out.println("La frase codificada es: ");
        System.out.println(codificacion(frase));
        
    }
    
    public static String codificacion (String secuencia){
        char letra;
        String nuevaSecuencia="";
        secuencia = secuencia.toLowerCase();
        
        for(int i=0;i<secuencia.length();i++){
            letra = secuencia.charAt(i);
            
            switch(letra){
                case 'a':
                case 'á':
                    nuevaSecuencia = nuevaSecuencia.concat("@");
                    break;
                case 'e':
                case 'é':
                    nuevaSecuencia = nuevaSecuencia.concat("#");
                    break;
                case 'i':
                case 'í':
                    nuevaSecuencia = nuevaSecuencia.concat("$");
                    break;
                case 'o':
                case 'ó':
                    nuevaSecuencia = nuevaSecuencia.concat("%");
                    break;
                case 'u':
                case 'ú':
                    nuevaSecuencia = nuevaSecuencia.concat("*");
                    break;
                default: 
                    nuevaSecuencia = nuevaSecuencia.concat((String.valueOf(letra)));
            }
            
        }
        return nuevaSecuencia;
    }
}
