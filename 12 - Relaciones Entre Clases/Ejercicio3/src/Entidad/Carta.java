
package Entidad;


public class Carta {
    
    private int NumeroCarta;
    private String Palo;

    public Carta() {
    }

    public Carta(int NumeroCarta, String Palo) {
        this.NumeroCarta = NumeroCarta;
        this.Palo = Palo;
    }

    public int getNumeroCarta() {
        return NumeroCarta;
    }

    public void setNumeroCarta(int NumeroCarta) {
        this.NumeroCarta = NumeroCarta;
    }

    public String getPalo() {
        return Palo;
    }

    public void setPalo(String Palo) {
        this.Palo = Palo;
    }

    @Override
    public String toString() {
        return ".: Carta :." +"\n - NumeroCarta=" + NumeroCarta + "\n- Palo=" + Palo;
    }

    
    
    
    
}
