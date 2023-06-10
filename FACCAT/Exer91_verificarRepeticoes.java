package FACCAT;

import java.util.Scanner;

/**
 * Exer91 - Faça um algoritmo para ler 50 números e armazenar em um vetor VET,
 * verificar e escrever se existem números repetidos no vetor VET e em que posições se encontram.
 */
public class Exer91_verificarRepeticoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[50];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vet[i] = scanner.nextInt();
        }

        boolean[] posicoesOcorrencia = new boolean[vet.length];

        boolean repetido = false;
        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    repetido = true;
                    posicoesOcorrencia[i] = true;
                    posicoesOcorrencia[j] = true;
                }
            }
        }

        if (!repetido) {
            System.out.println("Não há números repetidos no vetor.");
        } else {
            System.out.println("Posições dos números repetidos:");
            for (int i = 0; i < posicoesOcorrencia.length; i++) {
                if (posicoesOcorrencia[i]) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
