
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws DivisionException {
        Scanner entrada = new Scanner(System.in);

        try {

            System.out.print("Ingrese el primer numero: ");
            String numero1 = entrada.nextLine();
            System.out.print("Ingrese el segundo numero: ");
            String numero2 = entrada.nextLine();

            if (numero2.isEmpty() || numero1.isEmpty()) {
                throw new DivisionException("Error. Algun numero ingresado es vacio");
            }
            
            try {
                int num1 = Integer.parseInt(numero1);
                int num2 = Integer.parseInt(numero2);
                
                try {
                    double division = num1/num2;
                    System.out.println(num1 + "/" + num2 + " = " +division);
                } catch (ArithmeticException e) {
                    System.out.println("Error. No se puede dividir por cero");
                }
                
                
            } catch (NumberFormatException e) {
                System.out.println("No se pudo convertir algun numero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error al ingresar los numeros");
        }   catch (DivisionException e){
            System.out.println(e.getMessage());
        }
        

    }

}
