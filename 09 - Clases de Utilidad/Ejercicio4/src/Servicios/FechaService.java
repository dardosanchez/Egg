package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner entrada = new Scanner(System.in);

    public Date fechaNacimiento() {
        int aa, mm, dd;
        System.out.print("Ingrese anio de nacimiento (aaaa): ");
        aa = entrada.nextInt();
        System.out.print("Ingrese mes de nacimiento (mm): ");
        mm = entrada.nextInt();
        System.out.print("Ingrese dia de nacimiento (dd): ");
        dd = entrada.nextInt();
        return new Date(aa - 1900, mm - 1, dd); //Utilizar -1900 para fechas en 4 digitos
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth() < fechaNacimiento.getMonth()) {
            edad--;
        } else if (fechaActual.getMonth() == fechaNacimiento.getMonth() && fechaActual.getDay() < fechaNacimiento.getDay()) {
            edad--;
        }
        return edad;
    }

}
