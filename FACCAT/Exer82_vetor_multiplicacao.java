package FACCAT;

import java.util.Scanner;

// Ler um vetor A de 10 números. Após, ler mais um número e guardar em uma variável X. 
// Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X. Logo após, imprimir o vetor M.

public class Exer82_vetor_multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tamanhoVetor = 10;
        double[] vetorA = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            vetorA[i] = scanner.nextDouble();
        }

        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();

        double[] vetorM = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            vetorM[i] = vetorA[i] * x;
        }

        System.out.println("Vetor M:");
        for (double valor : vetorM) {
            System.out.println(valor);
        }

        scanner.close();
    }
}
