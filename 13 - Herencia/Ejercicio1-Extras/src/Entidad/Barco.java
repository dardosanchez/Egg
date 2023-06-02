
package Entidad;




public class Barco {
    
    protected String matricula;
    protected int eslora;
    protected int añoFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
     public double calcularModulo() {
        return eslora * 10;
    }

    @Override
    public String toString() {
        return "- Matricula: " + matricula + 
               "\n- Eslora: " + eslora + 
               "\n- Año de Fabricacion: " + añoFabricacion ;
    }
    
     
     
}
