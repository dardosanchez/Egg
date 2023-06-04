
package Ejercicios;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        int num1,num2;
        char opcion = 'N';
        
        
        System.out.println("Ingrese dos numeros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        do {   
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. SALIR");
            System.out.println("Elija Opcion:");
            menu = entrada.nextInt();
            
            
            switch (menu){
                case 1 : 
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                 case 2 : 
                      System.out.println("La resta es: " + (num1-num2));
                    break;
                 case 3 : 
                     System.out.println("La multiplicacion es: " + (num1*num2));
                    break;
                 case 4 : 
                      System.out.println("La division es: " + (num1/num2));
                    break;
                 case 5:
                    System.out.println("¿Está seguro que desea salir del programa(S/N)?");
                    opcion = entrada.next().charAt(0);
                     break;
                 default: 
                     System.out.println("Opcion ingresada incorrecta.");
            }
             
        } while (opcion!='S' && opcion!= 's');
        
    }
}
