
package Ejercicios;

import java.util.Scanner;

public class ExtrasN5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filas,columnas;
        int [][] matriz;
        
        System.out.print("Cantidad de filas: ");
        filas = entrada.nextInt();
        System.out.print("Cantidad de columnas: ");
        columnas = entrada.nextInt();
        
        matriz = new int [filas][columnas];
        
        System.out.print("La suma de sus elementos es " + cargarysumaMatriz(matriz, filas, columnas));
        
        
    }
    
    public static int cargarysumaMatriz (int [][] matriz,int filas,int columnas){
        int suma=0;
        
        for(int i=0;i<filas;i++){
            for(int j=0; j<columnas;j++){
                matriz[i][j] = (int)(Math.random()*10);
                suma+=matriz[i][j];
            }
        }
        return suma;
    }
    
}
