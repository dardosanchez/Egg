
package Entidad;

public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInst;

    public Polideportivo(String nombre, String tipoInst, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInst = tipoInst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInst() {
        return tipoInst;
    }

    public void setTipoInst(String tipoInst) {
        this.tipoInst = tipoInst;
    }

    
    
    
    
}
