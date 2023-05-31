
package Entidad;


public class Gato extends Animal{

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        super.Alimentarse(); 
        System.out.println("El perro se alimenta con " + alimento);
    }
    
    
    
}
