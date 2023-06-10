package MANZANO;

import java.util.Scanner;

/**
 * Exer06H_JuncaoTresMatrizes - Lê três matrizes (A, B e C) de uma dimensão com 5 elementos cada. Constrói
 * uma matriz D, sendo esta a junção das três outras matrizes. Desta forma D deverá ter o triplo de elementos,
 * ou seja, 15.
 */
public class Exer06H_JuncaoTresMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz A: ");
            int valor = scanner.nextInt();
            matrizA[i] = valor;
        }
        int[] matrizB = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz B: ");
            int valor = scanner.nextInt();
            matrizB[i] = valor;
        }
        int[] matrizC = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz C: ");
            int valor = scanner.nextInt();
            matrizC[i] = valor;
        }
        int[] matrizD = new int[15];
        for (int i = 0; i < 5; i++) {
            matrizD[i] = matrizA[i];
        }
        for (int i = 5; i < 10; i++) {
            matrizD[i] = matrizB[i - 5];
        }
        for (int i = 10; i < 15; i++) {
            matrizD[i] = matrizC[i - 10];
        }
        for (int valor : matrizD) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
