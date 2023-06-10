package FACCAT;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exer87 - Faça um algoritmo para ler 10 números e armazenar em um vetor.
 * Após isto, o algoritmo deve ordenar os números no vetor em ordem crescente.
 * Em seguida, deve ser lido mais um número qualquer e inserir esse novo número na posição correta,
 * ou seja, mantendo a ordem crescente do vetor.
 */
public class Exer87_inserirNumeroOrdenado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        Arrays.sort(numeros);

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.print("Digite um número para ser inserido no vetor: ");
        double novoNumero = scanner.nextDouble();

        int posicaoInsercao = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (novoNumero > numeros[i]) {
                posicaoInsercao = i + 1;
            } else {
                break;
            }
        }

        double[] novoVetor = new double[numeros.length + 1];

        for (int i = 0; i < posicaoInsercao; i++) {
            novoVetor[i] = numeros[i];
        }

        novoVetor[posicaoInsercao] = novoNumero;

        for (int i = posicaoInsercao + 1; i < novoVetor.length; i++) {
            novoVetor[i] = numeros[i - 1];
        }

        System.out.println("Vetor com o novo número inserido e ordenado:");
        for (int i = 0; i < novoVetor.length; i++) {
            System.out.println(novoVetor[i]);
        }

        scanner.close();
    }
}
