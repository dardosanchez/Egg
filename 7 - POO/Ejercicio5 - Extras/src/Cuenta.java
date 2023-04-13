
public class Cuenta {
    private double saldo;
    private String titular;
    
    // METODO
    
    public Cuenta(double saldo, String titular){
        
        this.saldo = saldo;
        this.titular = titular;
        
    }

    public void retirar_dinero(double cantidad) {
        if((saldo-cantidad) >= 0){
            saldo-=cantidad;
        } else {
            System.out.println("Sr/Sra " +titular+ ", no se puede realizar la transaccion. Saldo insuficiente.");
        }
    }
    
    public void mostrarDatos (){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
