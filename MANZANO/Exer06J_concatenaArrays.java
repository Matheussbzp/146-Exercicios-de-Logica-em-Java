package MANZANO;

import java.util.Scanner;

public class Exer06J_concatenaArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrizA = new int[6];
        int[] matrizB = new int[6];

        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < 6; i++) {
            System.out.printf("Digite um valor par para a matriz A na posição %d: ", i);
            int valor = scanner.nextInt();

            if (valor % 2 == 0) {
                matrizA[aIndex++] = valor;
            } else {
                i--;
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("Digite um valor ímpar para a matriz B na posição %d: ", i);
            int valor = scanner.nextInt();

            if (valor % 2 != 0) {
                matrizB[bIndex++] = valor;
            } else {
                i--;
            }
        }

        int[] matrizC = new int[12];

        for (int i = 0; i < 6; i++) {
            matrizC[i] = matrizA[i];
            matrizC[i + 6] = matrizB[i];
        }

        System.out.println("A matriz C é:");
        for (int valor : matrizC) {
            System.out.println(valor);
        }

        scanner.close();
    }

}
