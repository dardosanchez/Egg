
package Entidad;


public class Hotel extends Alojamiento{
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected double precioHabitaciones;

    public Hotel() {
    }
    
    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitacion();
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    
    public double precioHabitacion (){
       
        double precioFinal;
        
        precioFinal = 50+numCamas;
        
        return precioFinal;
    }

    @Override
    public String toString() {
        
        return super.toString() +  
                "\n Cantidad de Habitaciones: " + cantHabitaciones + 
                "\n Numero de Camas: " + numCamas + 
                "\n Cantidad de Pisos: " + cantPisos + 
                "\n Precio de las Habitaciones: " + precioHabitaciones;
    }
    
    
    
}
