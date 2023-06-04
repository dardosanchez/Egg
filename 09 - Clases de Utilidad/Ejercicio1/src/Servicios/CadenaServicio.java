
package Servicios;

import Entidad.Cadena;


public class CadenaServicio {

   public int mostrarVocales(Cadena c1){
       int contador=0;
       char letra;
       for(int i=0;i<c1.getLongitud();i++){
           letra = c1.getFrase().charAt(i);
           letra = Character.toUpperCase(letra);
           
           switch(letra){
               case 'A':
               case 'E':
               case 'I':
               case 'O':
               case 'U':
                  contador++;
           }
           
       }
       return contador;
   }
   
   public void invertirFrase(Cadena c1){
       for(int i=c1.getLongitud()-1;i>=0;i--){
           System.out.print(c1.getFrase().charAt(i));
       }
       System.out.println("");
   }
   
   public void vecesRepetido(String letra, Cadena c1){
       int contador=0;
       for(int i=0;i<c1.getLongitud();i++){
           
           if((c1.getFrase().substring(i, i+1).equals(letra))){
               contador++;
           }
       }
       System.out.println("El caracter '" + letra + "' se repite " + contador + " veces");
   }
   
   public boolean compararLongitud(String frase, Cadena c1){
       boolean resultado = false;
       
       if(frase.length() == c1.getLongitud()){
           resultado = true;
       }
       
       return resultado;
   }
   
   public void unirFrases(String frase, Cadena c1){
 
       System.out.println(c1.getFrase() +" "+ frase); 
       
   }
   
   public void reemplazar (String letra, Cadena c1){
      
       for(int i=0;i<c1.getLongitud();i++){
           
          if(c1.getFrase().charAt(i) == 'a'){
              System.out.print(letra); 
          } else {
              System.out.print(c1.getFrase().charAt(i));
          }
           
       }
         System.out.println("");
       
   }
   
   public boolean contiene(String letra, Cadena c1){
       boolean contiene = false;
       
     
       
       for(int i=0;i<c1.getLongitud();i++){
          
         if(String.valueOf(c1.getFrase().charAt(i)).equals(letra)){
             
             contiene = true;
             break;
         }
           
       }
       return contiene;
   }
   
}
