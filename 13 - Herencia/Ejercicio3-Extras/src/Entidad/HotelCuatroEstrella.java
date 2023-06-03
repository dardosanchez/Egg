
package Entidad;


public class HotelCuatroEstrella extends Hotel{
    
    protected boolean gimnasio;
    protected String tipoGimnasio;
    protected String nombreRestaurante;
    protected int capacidadRest;

    public HotelCuatroEstrella() {
    }

    public HotelCuatroEstrella(boolean gimnasio, String tipoGimnasio, String nombreRestaurante, int capacidadRest, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.tipoGimnasio = tipoGimnasio.toUpperCase();
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRest = capacidadRest;
    }


    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    public String getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(String tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    

    
    
    @Override
    public double precioHabitacion() {
        double precio = super.precioHabitacion();
        
        if(capacidadRest < 30){
            precio += 10;
        } else {
            if(capacidadRest>= 30 && capacidadRest<=50){
                precio += 30;
            } else {
                precio += 50;
            }
        }
        
        if(gimnasio){
            switch (tipoGimnasio) {
                
                case "A":
                    precio += 50;
                    break;
                case "B":
                    precio += 30;
                    break;
            }
        }
        
        
        return precio ; 
    }

    @Override
    public String toString() {
        
        return super.toString() + "HotelCuatroEstrella{" + "gimnasio=" + gimnasio + ", tipoGimnasio=" + tipoGimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRest=" + capacidadRest + '}';
    }
    
    
    
}
