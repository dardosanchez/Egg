
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CuentaBancariaServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    // Crear una cuenta
    public CuentaBancaria crearCuenta (){
        
        String numCuenta = JOptionPane.showInputDialog(null, "Ingrese el número de cuenta:", "Datos del usuario", JOptionPane.PLAIN_MESSAGE);
        String dni = JOptionPane.showInputDialog(null, "Ingrese el DNI:", "Datos del usuario", JOptionPane.PLAIN_MESSAGE);
        String saldo = JOptionPane.showInputDialog(null, "Ingrese su saldo actual:", "Datos del usuario", JOptionPane.PLAIN_MESSAGE);
 
        CuentaBancaria cuenta = new CuentaBancaria(Integer.parseInt(numCuenta),Long.parseLong(dni),Double.parseDouble(saldo));

        // return new CuentaBancaria(numero, dni, saldo);
        return cuenta;
    }
    
    public void ingresar (double dinero,CuentaBancaria cuenta){
        
        if(dinero>=0){
            cuenta.setSaldoActual(cuenta.getSaldoActual() + dinero);
        JOptionPane.showMessageDialog(null, "Saldo agregado correctamente", "Atencion", JOptionPane.INFORMATION_MESSAGE); 
        } else {
              JOptionPane.showMessageDialog(null, "Saldo ingresado incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
    }
    
    public void retirar (double dinero,CuentaBancaria cuenta){
        double resta = cuenta.getSaldoActual()-dinero;
       
        if(resta < 0){
            cuenta.setSaldoActual(cuenta.getSaldoActual()- (dinero-resta));
            JOptionPane.showMessageDialog(null, "Saldo insuficiente. Se retirara $"+ (dinero-resta), "Atencion", JOptionPane.ERROR_MESSAGE);
           // System.out.print("Saldo insuficiente. Se retirara $" + (dinero-resta));
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual()-dinero);
            JOptionPane.showMessageDialog(null, "Dinero retirado Exitosamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void extraccionRapida (CuentaBancaria cuenta){
        String cantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad a retirar:", "Extracción rápida", JOptionPane.PLAIN_MESSAGE);
        
        if((cuenta.getSaldoActual()*0.20) >= Double.parseDouble(cantidad)) {
           cuenta.setSaldoActual(cuenta.getSaldoActual()- Double.parseDouble(cantidad));
           JOptionPane.showMessageDialog(null, "Dinero retirado Exitosamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
           JOptionPane.showMessageDialog(null, "Monto maximo a extraer $"+ cuenta.getSaldoActual()*0.20, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void consultarSaldo (CuentaBancaria cuenta){
        JOptionPane.showMessageDialog(null, "Saldo disponible: $"+ cuenta.getSaldoActual(),"Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void consultarDatos (CuentaBancaria cuenta){
        
        String menu = "- Numero de Cuenta " + cuenta.getNumeroCuenta() + "\n"
                    + "- DNI: " + cuenta.getDniCliente() + "\n"
                    + "- Saldo Disponible: $" + cuenta.getSaldoActual() + "\n";
                    
        
       JOptionPane.showMessageDialog(null, menu,"Datos del Cliente", JOptionPane.INFORMATION_MESSAGE);
       
    }
}
