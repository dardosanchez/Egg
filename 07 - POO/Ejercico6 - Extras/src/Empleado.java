
public class Empleado {
    // Atributos
    private String nombre;
    private int edad;
    private double salario;
    
    // METODOS
    
    public Empleado (String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void calcular_aumento() {
        if(edad>30){
            salario = salario + salario * 0.10;
        } else {
            salario = salario + salario * 0.05;
        }
    }
    
    public void mostrarDatos (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
