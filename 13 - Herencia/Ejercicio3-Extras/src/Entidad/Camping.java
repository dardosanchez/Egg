
package Entidad;


public class Camping extends ExtraHotel{
    
    protected int capacidadCarpas;
    protected int cantBaños;
    protected boolean restaurant;

    public Camping() {
    }
    
    public Camping(int capacidadCarpas, int cantBaños, boolean restaurant, boolean privado, int metrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrado, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBaños = cantBaños;
        this.restaurant = restaurant;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    
    
}
