
package Entidad;


public class Perro extends Animal{

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    // Aplicamos Polimorfismo
    @Override
    public void Alimentarse() {
        super.Alimentarse(); 
        System.out.println("El perro se alimenta con " + alimento);
    }

}
