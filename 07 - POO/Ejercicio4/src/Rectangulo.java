
import java.util.Scanner;


public class Rectangulo {
    // ATRIBUTOS
    private double base;
    private double altura;
    
    // METODOS

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public void crearRectangulo (){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresar base: ");
        setBase(entrada.nextDouble());
        
        System.out.print("Ingresar altura: ");
        setAltura(entrada.nextDouble());
          
    }
    
    public double superficie (){
        return getBase()*getAltura();
    }
    
    public double perimetro (){
        return (getBase()+getBase())*2;
    }
    
    public void dibujarRectangulo (){
        
        for(int i=1;i<=getAltura();i++){
            for(int j=1;j<=getBase();j++){
                if(i==1 || j==1 || j==getBase() || i==getAltura()){
                    System.out.print("*");
                } else {
                     System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
    }
    
}
