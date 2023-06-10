package MANZANO;

import java.util.Scanner;

/**
 * Exer06F_JuncaoMatrizes - Lê duas matrizes do tipo vetor, sendo A com 20 elementos e B com 30 elementos.
 * Constrói uma matriz C, sendo esta a junção das duas outras matrizes. Desta forma, C deverá ter a capacidade
 * de armazenar 50 elementos.
 */
public class Exer06F_JuncaoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz A: ");
            int valor = scanner.nextInt();
            matrizA[i] = valor;
        }
        int[] matrizB = new int[30];
        for (int i = 0; i < 30; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz B: ");
            int valor = scanner.nextInt();
            matrizB[i] = valor;
        }
        int[] matrizC = new int[50];
        for (int i = 0; i < 20; i++) {
            matrizC[i] = matrizA[i];
        }
        for (int i = 20; i < 50; i++) {
            matrizC[i] = matrizB[i - 20];
        }
        for (int valor : matrizC) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
