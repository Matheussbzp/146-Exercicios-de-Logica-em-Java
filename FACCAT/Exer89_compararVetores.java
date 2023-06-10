package FACCAT;

import java.util.Scanner;

/**
 * Exer89 - Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada.
 * Calcular e escrever a quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições.
 */
public class Exer89_compararVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v1 = new int[15];
        int[] v2 = new int[15];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do vetor V1: ");
            v1[i] = scanner.nextInt();
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do vetor V2: ");
            v2[i] = scanner.nextInt();
        }

        int quantidadeMesmosNumeros = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) {
                quantidadeMesmosNumeros++;
            }
        }

        System.out.println("Quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições: " + quantidadeMesmosNumeros);

        scanner.close();
    }
}
