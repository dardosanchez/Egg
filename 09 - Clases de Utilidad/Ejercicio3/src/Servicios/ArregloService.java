
package Servicios;

import java.util.Arrays;

public class ArregloService {
    
    public void inicializarA (double [] a){
        for(int i=0;i<a.length;i++){
            double aleatorio = Math.random()*10;
            Arrays.fill(a, aleatorio);
        }
    }
    
    
    public void mostrar (double [] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    
    
    public void ordenar (double [] arreglo){
        Arrays.sort(arreglo);
        
        for(int i=0;i<arreglo.length/2;i++){
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - i - 1];
            arreglo[arreglo.length - i - 1] = temp;
        }
    }
    
    public void inicializarB (double [] A, double [] B){
        for(int i=0;i<10;i++){
           B[i]=A[i]; 
        }
        
        Arrays.fill(B,10, B.length,0.5);
        
    }
    
}
