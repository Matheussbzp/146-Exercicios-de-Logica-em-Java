package MANZANO;

import java.util.Scanner;

/**
 * Exer06B_MultiplicaPorTres - Lê 8 elementos em uma matriz A tipo vetor. Constrói uma matriz B de mesma
 * dimensão com os elementos da matriz A multiplicados por 3.
 */
public class Exer06B_MultiplicaPorTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz A: ");
            int valor = scanner.nextInt();
            matrizA[i] = valor;
        }
        int[] matrizB = new int[8];
        for (int i = 0; i < 8; i++) {
            matrizB[i] = matrizA[i] * 3;
        }
        for (int valor : matrizB) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
