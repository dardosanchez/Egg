
package Servicios;

import Entidad.Edificio;


public class PolideportivoServices extends EdificioService{
    
      @Override
    public double calcularSuperficie(Edificio e) {
    //    EdificioDeOficinas eo = (EdificioDeOficinas) e;
        return e.getAncho()*e.getLargo();
    }

    @Override
    public double calcularVolumen(Edificio e) {
        return e.getAlto()*e.getAncho()*e.getLargo();
    }
    
}
