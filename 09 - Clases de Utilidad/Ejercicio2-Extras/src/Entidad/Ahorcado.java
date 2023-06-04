
package Entidad;

public class Ahorcado {
    // Atributos
    
    private char [] vector;
    private int cantLetras;
    private int cantJugadasMax;
    private int encontradas = 0;
    
    public Ahorcado() {
    }

    public Ahorcado(char[] vector, int cantLetras, int cantJugadasMax) {
        this.vector = vector;
        this.cantLetras = cantLetras;
        this.cantJugadasMax = cantJugadasMax;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }
    
    public char[] getVector() {
        return vector;
    }

    public void setVector(char[] vector) {
        this.vector = vector;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }
    
    
}
