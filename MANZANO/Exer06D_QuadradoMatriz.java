package MANZANO;

import java.util.Scanner;

/**
 * Exer06D_QuadradoMatriz - Lê 15 elementos de uma matriz tipo vetor. Constrói
 * uma matriz B de mesmo tipo,
 * onde todo elemento de B é o quadrado do elemento de A correspondente.
 */
public class Exer06D_QuadradoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            int valor = scanner.nextInt();
            matrizA[i] = valor;
        }
        int[] matrizB = new int[15];
        for (int i = 0; i < 15; i++) {
            matrizB[i] = matrizA[i] * matrizA[i];
        }
        System.out.println("Matriz A:");
        for (int valor : matrizA) {
            System.out.println(valor);
        }
        System.out.println("Matriz B:");
        for (int valor : matrizB) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
