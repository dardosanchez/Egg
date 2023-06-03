
package Entidad;


public class ExtraHotel extends Alojamiento{
    
    protected boolean privado;
    protected int metrosCuadrado;

    public ExtraHotel() {
    }

    public ExtraHotel(boolean privado, int metrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrado = metrosCuadrado;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrado() {
        return metrosCuadrado;
    }

    public void setMetrosCuadrado(int metrosCuadrado) {
        this.metrosCuadrado = metrosCuadrado;
    }
    
    
    
}
