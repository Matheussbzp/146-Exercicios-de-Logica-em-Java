package FACCAT;

import java.util.Scanner;

/**
 * Exer88 - Faça um algoritmo para ler um vetor de 20 números.
 * Após isto, deverá ser lido mais um número qualquer e verificar se esse número existe no vetor ou não.
 * Se existir, o algoritmo deve gerar um novo vetor sem esse número.
 * (Considere que não haverão números repetidos no vetor).
 */
public class Exer88_removerNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para ser removido do vetor: ");
        int numeroRemocao = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroRemocao) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numeroRemocao + " não está presente no vetor.");
        } else {
            int[] novoVetor = new int[numeros.length - 1];

            int posicaoRemocao = 0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numeroRemocao) {
                    posicaoRemocao = i;
                    break;
                }
            }

            for (int i = 0, j = 0; i < numeros.length; i++) {
                if (i != posicaoRemocao) {
                    novoVetor[j++] = numeros[i];
                }
            }

            System.out.println("Novo vetor sem o número " + numeroRemocao + ":");
            for (int i = 0; i < novoVetor.length; i++) {
                System.out.println(novoVetor[i]);
            }
        }

        scanner.close();
    }
}
