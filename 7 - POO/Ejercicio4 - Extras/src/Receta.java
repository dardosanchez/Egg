
public class Receta {
    // ATRIBUTOS
    public String nombre;
    public int CantIngredientes;
    String instrucciones;
    int tiempoPreparacion;
    String dificultad;
    
    // METODOS
    
    public Receta(String nombre, int CantIngredientes, String instrucciones, int tiempoPreparacion, String dificultad) {
        this.nombre = nombre;
        this.CantIngredientes = CantIngredientes;
        this.instrucciones = instrucciones;
        this.tiempoPreparacion = tiempoPreparacion;
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantIngredientes() {
        return CantIngredientes;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantIngredientes(int CantIngredientes) {
        this.CantIngredientes = CantIngredientes;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    
}
