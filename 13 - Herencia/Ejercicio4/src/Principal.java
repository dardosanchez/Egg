
import Entidad.Circulo;
import Entidad.Rectangulo;


public class Principal {

    
    public static void main(String[] args) {
     
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        System.out.println("Area del Circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del Circulo: " + circulo.calcularPerimetro());
        System.out.println("=======================================");
        System.out.println("Area del Rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del Rectangulo: " + rectangulo.calcularPerimetro());

    }


}
