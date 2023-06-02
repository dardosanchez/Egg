
package Entidad;


public class EdificioDeOficinas extends Edificio{
    private int numeroOficinas;
    private int cantPersonas;
    private int cantPisos;

    public EdificioDeOficinas(int numeroOficinas, int cantPersonas, int cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }


    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }
    
    
}
