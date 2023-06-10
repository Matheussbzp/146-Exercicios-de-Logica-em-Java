package MANZANO;

import java.util.Scanner;

/**
 * Exer06E_JuncaoMatrizes - Lê duas matrizes A e B do tipo vetor com 15 elementos cada. Constrói uma matriz
 * C, sendo esta a junção das duas outras matrizes. Desta forma, C deverá ter o dobro de elementos, ou seja, 30.
 */
public class Exer06E_JuncaoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz A: ");
            int valor = scanner.nextInt();
            matrizA[i] = valor;
        }
        int[] matrizB = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz B: ");
            int valor = scanner.nextInt();
            matrizB[i] = valor;
        }
        int[] matrizC = new int[30];
        for (int i = 0; i < 15; i++) {
            matrizC[i] = matrizA[i];
        }
        for (int i = 15; i < 30; i++) {
            matrizC[i] = matrizB[i - 15];
        }
        for (int valor : matrizC) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
