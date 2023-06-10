package MANZANO;

import java.util.Scanner;

/**
 * Exer06G_InverteMatriz - Lê 20 elementos de uma matriz A tipo vetor e constrói uma matriz B de mesma
 * dimensão com os mesmo elementos da matriz A, sendo que deverão estar invertidos. Ou seja, o primeiro
 * elemento de A passa a ser o último de B, o segundo elemento de A passa a ser o penúltimo elemento de B e
 * assim por diante. Apresentar as matrizes A e B lado a lado.
 */
public class Exer06G_InverteMatriz {
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
            matrizB[i] = matrizA[19 - i];
        }
        System.out.println("Matriz A:\tMatriz B:");
        for (int i = 0; i < 20; i++) {
            System.out.println(matrizA[i] + "\t\t" + matrizB[i]);
        }
        scanner.close();
    }
}
