
package Entidad;

public class Velero extends Barco{
    protected int cantMastil;

    public Velero(int cantMastil) {
        this.cantMastil = cantMastil;
    }

    public Velero() {
    }

    public Velero(int cantMastil, String matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.cantMastil = cantMastil;
    }

    public int getCantMastil() {
        return cantMastil;
    }

    public void setCantMastil(int cantMastil) {
        this.cantMastil = cantMastil;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+cantMastil; 
    }

    @Override
    public String toString() { 
        return super.toString() + "\n- Cantidad de Mastil: " + cantMastil;
    }
    
    
    
}
