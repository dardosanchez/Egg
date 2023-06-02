
package Entidad;




public class Yate extends Barco{
    protected int potenciaCV;
    protected int cantCamarotes;

    public Yate() {
    }

    public Yate(int potenciaCV, int cantCamarotes, String matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
        this.cantCamarotes = cantCamarotes;
    }

    

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + cantCamarotes; 
    }

    @Override
    public String toString() {
        
        return super.toString() + "\n- Potencia CV: " + potenciaCV 
                + "\n- Cantidad de Camarotes: " + cantCamarotes;
    }
    
    
    
}
