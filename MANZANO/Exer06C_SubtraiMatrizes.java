package MANZANO;

import java.util.Scanner;

/**
 * Exer06C_SubtraiMatrizes - Lê duas matrizes A e B do tipo vetor com 20 elementos. Constrói uma matriz C,
 * onde cada elemento de C é a subtração do elemento correspondente de A com B.
 */
public class Exer06C_SubtraiMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz A: ");
            int valor = scanner.nextInt();
            matrizA[i] = valor;
        }
        int[] matrizB = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz B: ");
            int valor = scanner.nextInt();
            matrizB[i] = valor;
        }
        int[] matrizC = new int[20];
        for (int i = 0; i < 20; i++) {
            matrizC[i] = matrizA[i] - matrizB[i];
        }
        for (int valor : matrizC) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
