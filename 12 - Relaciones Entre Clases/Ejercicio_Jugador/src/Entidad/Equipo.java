
package Entidad;

import java.util.ArrayList;


public class Equipo {
    private String nombre;
    private ArrayList <Jugador> listajug ;
    

    public Equipo() {
    }

    public Equipo(String nombre, ArrayList<Jugador> listajug) {
        this.nombre = nombre;
        this.listajug = listajug;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getListajug() {
        return listajug;
    }

    public void setListajug(ArrayList<Jugador> listajug) {
        this.listajug = listajug;
    }
    
    
    
}
