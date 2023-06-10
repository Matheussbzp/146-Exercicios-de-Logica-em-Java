package FACCAT;

import java.util.Scanner;

// O mesmo exercício anterior, mas agora deve escrever o menor elemento do vetor e a respectiva posição dele nesse vetor.

public class Exer81_vetor_maior_menor_elemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tamanhoVetor = 20;
        double[] vetor = new double[tamanhoVetor];

        double maiorElemento = Double.MIN_VALUE;
        int posicaoMaiorElemento = -1;

        double menorElemento = Double.MAX_VALUE;
        int posicaoMenorElemento = -1;

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

            if (numero < menorElemento) {
                menorElemento = numero;
                posicaoMenorElemento = i;
            }
        }

        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posição do maior elemento: " + posicaoMaiorElemento);
        System.out.println("Menor elemento: " + menorElemento);
        System.out.println("Posição do menor elemento: " + posicaoMenorElemento);

        scanner.close();
    }
}
