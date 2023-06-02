
package Entidad;




public class BarcoMotor extends Barco {
    protected double potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(double potenciaCV, String matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+potenciaCV; 
    }

    @Override
    public String toString() {
        
        return super.toString() + "\n- Potencia CV: " + potenciaCV ;
    }
    
    
    
}
