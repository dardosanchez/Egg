
public class Principal {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        
        r1.crearRectangulo();
        
        System.out.println("Superficie: " + r1.superficie());
        System.out.println("Perimetro: " + r1.perimetro());
        
        r1.dibujarRectangulo();
        
    }
    
}
