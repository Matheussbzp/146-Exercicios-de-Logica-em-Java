package FACCAT;

import java.util.Scanner;

// Faça um programa que leia 100 valores e no final, escreva o maior e o menor valor lido.

public class Exer70_maior_menor_valor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 100;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o valor #" + i + ": ");
            int valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("O maior valor lido foi: " + maiorValor);
        System.out.println("O menor valor lido foi: " + menorValor);

        scanner.close();
    }
}
