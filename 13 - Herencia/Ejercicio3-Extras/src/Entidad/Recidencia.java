
package Entidad;


public class Recidencia extends ExtraHotel{
    
    protected int cantHabitaciones ;
    protected boolean descuentoGremios;
    protected boolean campoDeportivo;

    public Recidencia() {
    }

    public Recidencia(int cantHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, int metrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrado, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
    
}
