
package Servicios;

import Entidad.Revolver;


public class RevolverServices {
    

    
    public void llenarRevolver (Revolver r1){
        
        r1.setPosicionActual((int) (Math.random()*6));
        r1.setPosicionAgua((int)(Math.random()*6));
        
    }
    
    
    public boolean mojar(Revolver r1){
        boolean retorno = false;
       
        if(r1.getPosicionActual()== r1.getPosicionAgua()){
            retorno = true;
        }
        return retorno;
    }
    
    public void siguienteChorro (Revolver r1){
        if(r1.getPosicionActual() == 6){
             r1.setPosicionActual(1);
        } else{
             r1.setPosicionActual(r1.getPosicionActual()+1);
        }
       
        
    }
    
    
    
    
    
}
