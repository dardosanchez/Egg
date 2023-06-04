package Ejercicios;

public class Ejercicio5 {

    public static void main(String[] args) {
        int matriz[][] = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int matrizAnt[][] = {{0, 2, -4}, {-2, 0, -2}, {4, 2, 0}};

        System.out.println("ORIGINAL:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }

        System.out.println("TRANSPUESTA:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizAnt[i][j] + "] ");
            }
            System.out.println("");
        }

        System.out.println("CONTROLAR:");
        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matriz[i][j] - matrizAnt[j][i]) != 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Las Matrices son antisimétricas");
        } else {
            System.out.println("Las Matrices NO son antisimétricas");
        }
    }

}
