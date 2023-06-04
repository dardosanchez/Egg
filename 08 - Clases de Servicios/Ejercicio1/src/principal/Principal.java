package principal;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        CuentaBancariaServicio cs = new CuentaBancariaServicio();
        //CuentaBancaria cuenta = cs.crearCuenta();
        CuentaBancaria cuenta = new CuentaBancaria(4875, 42272167, 500000);
        // ==============================================================================
        boolean salir = false;

        while (!salir) {

            // Menú de opciones
            String menu = "                    MENU\n\n"
                    + "1. Ingresar dinero\n"
                    + "2. Retirar dinero\n"
                    + "3. Extracción rápida\n"
                    + "4. Consultar saldo\n"
                    + "5. Consultar datos\n"
                    + "6. Salir";
            String seleccion = JOptionPane.showInputDialog(null, menu, "Nuevo Banco de Santa Fe", JOptionPane.PLAIN_MESSAGE);

            if (seleccion == null || seleccion.isEmpty()) {
                // Si el usuario ha presionado el botón "Cancelar" o ha dejado el campo vacío,
                // no hacemos nada y permitimos que el usuario vuelva a seleccionar una opción del menú
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0); // Salir del programa
                } else {
                    continue; // Volver al menú principal
                }
            }

            switch (seleccion) {
                case "1": // Ingresar dinero
                    String cantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad a ingresar:", "Ingresar dinero", JOptionPane.PLAIN_MESSAGE);
                    // Aquí iría el código para procesar el ingreso de dinero

                    if (cantidad == null || cantidad.isEmpty()) {
                        // Si el usuario ha presionado el botón "Cancelar" o ha dejado el campo vacío,
                        // no hacemos nada y permitimos que el usuario vuelva a seleccionar una opción del menú
                        continue;
                    }

                    cs.ingresar(Double.parseDouble(cantidad), cuenta);
                    break;

                case "2": // Retirar dinero
                    cantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad a retirar:", "Retirar dinero", JOptionPane.PLAIN_MESSAGE);
                    // Aquí iría el código para procesar el retiro de 
                    cs.retirar(Double.parseDouble(cantidad), cuenta);
                    break;

                case "3": // Extracción rápida
                    // Aquí iría el código para procesar la extracción rápida

                    cs.extraccionRapida(cuenta);
                    break;

                case "4": // Consultar saldo
                    // Aquí iría el código para mostrar el saldo actual del usuario
                    cs.consultarSaldo(cuenta);
                    // JOptionPane.showMessageDialog(null, "El saldo actual del usuario es: $1000", "Consultar saldo", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "5": // Consultar datos
                    // Aquí iría el código para mostrar los datos del usuario
                    cs.consultarDatos(cuenta);
                    //JOptionPane.showMessageDialog(null, "Número de cuenta: 123456\nDNI: 12345678\nSaldo actual: $1000", "Consultar datos", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "6": // Salir
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        salir = true; // Salir del programa
                        break;
                    }

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
