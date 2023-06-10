package FACCAT;

import java.util.Scanner;

/**
 * Exer90 - Faça um algoritmo para ler um vetor de 30 números.
 * Após isto, ler mais um número qualquer, calcular e escrever quantas vezes esse número aparece no vetor.
 */
public class Exer90_contarNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[30];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para contar as ocorrências: ");
        int numeroBusca = scanner.nextInt();

        int quantidadeOcorrencias = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBusca) {
                quantidadeOcorrencias++;
            }
        }

        System.out.println("O número " + numeroBusca + " aparece " + quantidadeOcorrencias + " vezes no vetor.");

        scanner.close();
    }
}
