
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DivisionNumero divnumero = new DivisionNumero();
        
        
        System.out.print("Numero 1: ");
        String num1 = entrada.nextLine();
        System.out.print("Numero 2: ");
        String num2 = entrada.nextLine();

        try {
            divnumero.numero1 = Integer.parseInt(num1);
            divnumero.numero2 = Integer.parseInt(num2);
            double division =  divnumero.getNumero1()/ divnumero.getNumero2();

            System.out.println("El resultado es " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error. Division por cero");
        }

    }
    
}
