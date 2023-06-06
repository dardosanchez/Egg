
package Entidad;


public class HotelCincoEstrellas extends HotelCuatroEstrella{
    
    protected int cantSalonesConf;
    protected int cantSuites;
    protected int cantLimosina;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(int cantSalonesConf, int cantSuites, int cantLimosina, boolean gimnasio, String tipoGimnasio, String nombreRestaurante, int capacidadRest, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, tipoGimnasio, nombreRestaurante, capacidadRest, cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosina = cantLimosina;
    }

    

    public int getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(int cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosina() {
        return cantLimosina;
    }

    public void setCantLimosina(int cantLimosina) {
        this.cantLimosina = cantLimosina;
    }

    @Override
    public double precioHabitacion() {
        double precio = super.precioHabitacion();
        
        precio += (cantLimosina*15);
        
        return precio; 
    }

    @Override
    public String toString() {
        
        return super.toString() + 
                "\n Cantidad Salones de Conferencia: " + cantSalonesConf + 
                "\n Cantidad de Suites: " + cantSuites + 
                "\n Cantidad de Limosinas: " + cantLimosina;
    }
    
    
    
}
