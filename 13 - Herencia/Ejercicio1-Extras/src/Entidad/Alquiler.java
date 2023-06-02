
package Entidad;

import java.util.Date;


public class Alquiler {
    protected String nombre;
    protected int dniCliente;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected int posisionAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int dniCliente, Date fechaAlquiler, Date fechaDevolucion, int posisionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posisionAmarre = posisionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevol() {
        return fechaDevolucion;
    }

    public void setFechaDevol(Date fechaDevol) {
        this.fechaDevolucion = fechaDevol;
    }

    public int getPosisionAmarre() {
        return posisionAmarre;
    }

    public void setPosisionAmarre(int posisionAmarre) {
        this.posisionAmarre = posisionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    
    public double calcularAlquiler (){
      
        long tiempoAlquilerMillis = fechaDevolucion.getTime() - fechaAlquiler.getTime();
        long tiempoAlquilerDias = tiempoAlquilerMillis / (86400000);
        
        double moduloBarco = barco.calcularModulo();
        double precioFinal = tiempoAlquilerDias * moduloBarco;
         
        return precioFinal;
    }
    
    
    
    public void mostrarResumenAlquiler (){
        System.out.println("");
        System.out.println("______ .:RESUMEN DEL ALQUILER:. ______ ");
        System.out.println("- Cliente: " + nombre);
        System.out.println("- DNI: " + dniCliente);
        System.out.println("- Fecha de Alquiler: " + fechaAlquiler.getDate() + "/" + fechaAlquiler.getMonth()+ "/" + fechaAlquiler.getYear());
        System.out.println("- Fecha de Devolucion: " + fechaDevolucion.getDate() + "/" + fechaDevolucion.getMonth()+ "/" + fechaDevolucion.getYear());
        System.out.println("- Posicion Amarre: " + posisionAmarre);
        System.out.println("         DATOS DEL BARCO                 ");
        System.out.println(barco.toString());
        System.out.println("- Precio Total del Alquiler $" + calcularAlquiler());
        System.out.println("");
    }
    
}
