package Servicios;

import Entidad.Raices;


public class RaicesServicios {

    // Insiso A)
    public double getDiscriminante(Raices r1) {
        return ((r1.getB() * r1.getB()) - 4 * r1.getA() * r1.getC());
    }

    // Insiso B)
    public boolean tieneRaices(Raices r1) {
        boolean resultado;

        if (getDiscriminante(r1) >= 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    // Insiso C)
    public boolean tieneRaiz(Raices r1) {
        boolean resultado;
        if (getDiscriminante(r1) == 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    // Insiso D)
    public void obtenerRaices(Raices r1) {
        if (tieneRaices(r1)) {
            System.out.print("X1 = " + (-r1.getB() + Math.sqrt(getDiscriminante(r1))) / (2 * r1.getA()));
            System.out.print("X2 = " + (-r1.getB() - Math.sqrt(getDiscriminante(r1))) / (2 * r1.getA()));
        }
    }

    // Insiso E)
    public void obtenerRaiz(Raices r1) {
        if (tieneRaiz(r1)) {
            System.out.print("X1 = " + (-r1.getB() + Math.sqrt(getDiscriminante(r1))) / (2 * r1.getA()));
        }
    }

    // Insiso F)
    public void calcular(Raices r1) {
        if (tieneRaices(r1)) {
            obtenerRaices(r1);
        } else {
            if (tieneRaiz(r1)) {
                obtenerRaiz(r1);
            } else {
                System.out.println("No existe solucion");
            }
        }
    }
}
