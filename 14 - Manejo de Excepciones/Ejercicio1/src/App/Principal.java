
package App;


public class Principal {

    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Dardo", "Sanchez", 14);
        
        try{
            p1.esMayor();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
