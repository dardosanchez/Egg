
public class Principal {

    
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta(34000,"Dardo Exequiel Sanchez");
        
     //   c1.retirar_dinero(40000);
        
        System.out.println("");
        
        c1.retirar_dinero(2000);
        
        
        c1.mostrarDatos();
    }
    
}
