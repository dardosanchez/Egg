
import java.util.Scanner;


public class Puntos {
    // ATRIBUTOS
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    
    // METODOS

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar los valores: ");
        System.out.println("Punto N°1: ");
        System.out.print("X: ");
        setX1(entrada.nextDouble());
        System.out.print("Y: ");
        setY1(entrada.nextDouble());
        
        System.out.println("");
        
        System.out.println("Punto N°2: ");
        System.out.print("X: ");
        setX2(entrada.nextDouble());
        System.out.print("Y: ");
        setY2(entrada.nextDouble());
    }
    
    public double distanciaPuntos(){
        return Math.sqrt(Math.pow(getX2()-getX1(),2) + Math.pow(getY2()-getY1(),2));
    }
    
}
