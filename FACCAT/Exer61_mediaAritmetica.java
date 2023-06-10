package FACCAT;

// 61) Ler 10 valores, calcular e escrever a média aritmética desses valores lidos.

import java.util.Scanner;

public class Exer61_mediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / 10;

        System.out.printf("A média aritmética dos valores digitados é %.2f.\n", media);

        scanner.close();
    }
}
