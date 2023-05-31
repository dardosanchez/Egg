
package Entidad;

import java.util.ArrayList;

public class Baraja {
    
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> cartasElim;

    public Baraja(ArrayList<Carta> mazo, ArrayList<Carta> cartasElim) {
        this.mazo = mazo;
        this.cartasElim = cartasElim;
    }

    public Baraja() {
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getCartasElim() {
        return cartasElim;
    }

    public void setCartasElim(ArrayList<Carta> cartasElim) {
        this.cartasElim = cartasElim;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }
    
    
    
}
