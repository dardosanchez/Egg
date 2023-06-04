package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Ingrese tamaño de vector : ");
        n = entrada.nextInt();

        int[] vect = new int[n], numero = new int[5];
        for (int i = 0; i < n; i++) {
            vect[i] = (int) (Math.random() * 10000);
            System.out.print(vect[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            switch (cantdig(vect[i])) {
                case 1:
                    numero[0]++;
                    break;
                case 2:
                    numero[1]++;
                    break;
                case 3:
                    numero[2]++;
                    break;
                case 4:
                    numero[3]++;
                    break;
                case 5:
                    numero[4]++;
                    break;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("La cantidad numero de " + (i + 1) + " digitos es :" + numero[i]);
        }
    }

    public static int cantdig(int n) {
        int dig = 1;

        while (n > 9) {
            n = n / 10;
            dig++;
        }
        return dig;
    }
}
