package FACCAT;

import java.util.Scanner;

// Faça um algoritmo para ler 20 números e armazenar em um vetor. 
// Após a leitura total dos 20 números, o algoritmo deve escrever esses 20 números lidos na ordem inversa.

public class Exer83_vetor_ordem_inversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tamanhoVetor = 20;
        double[] vetor = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Ordem inversa:");
        for (int i = tamanhoVetor-1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
