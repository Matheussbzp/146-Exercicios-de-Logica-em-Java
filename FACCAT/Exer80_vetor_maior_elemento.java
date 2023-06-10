package FACCAT;

import java.util.Scanner;

// Ler um vetor Q de 20 posições (aceitar somente números positivos). 
// Escrever a seguir o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor.

public class Exer80_vetor_maior_elemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tamanhoVetor = 20;
        double[] vetor = new double[tamanhoVetor];

        double maiorElemento = Double.MIN_VALUE;
        int posicaoMaiorElemento = -1;

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número positivo para a posição " + i + ": ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                System.out.println("Valor inválido! Digite um número positivo.");
                i--;
                continue;
            }

            vetor[i] = numero;

            if (numero > maiorElemento) {
                maiorElemento = numero;
                posicaoMaiorElemento = i;
            }
        }

        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posição do maior elemento: " + posicaoMaiorElemento);

        scanner.close();
    }
}
