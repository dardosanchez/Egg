
package Ejercicios;

import java.util.Scanner;


public class ExtrasN7 {

    public static void main(String[] args) {
      int n,maximo=0,minimo=999999,cantTotal,suma=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite la cantidad de numeros a ingresar: ");
        cantTotal = entrada.nextInt();
        
        int i=0;
        while(i<cantTotal){
            System.out.print("Digite un numero: ");
            n = entrada.nextInt();
            
            
            if(n>maximo){
                maximo = n;
            }
            if(n<minimo){
                minimo = n;
            }
            
            suma += n;
            i++;
        }
        System.out.println("El valor maximo es " + maximo);
        System.out.println("El valor minimo es " + minimo);
        System.out.println("El promedio es " + (suma/cantTotal));
        
    }
    
}
