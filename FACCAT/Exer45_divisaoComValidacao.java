package FACCAT;

// 45) Reescreva o exercício anterior utilizando a estrutura ENQUANTO.

import java.util.Scanner;

public class Exer45_divisaoComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor (não pode ser zero): ");
        valor2 = scanner.nextDouble();

        while (valor2 == 0) {
            System.out.print("Valor inválido. Digite um novo valor: ");
            valor2 = scanner.nextDouble();
        }

        double resultado = valor1 / valor2;

        System.out.printf("%.2f / %.2f = %.2f\n", valor1, valor2, resultado);

        scanner.close();
    }
}
