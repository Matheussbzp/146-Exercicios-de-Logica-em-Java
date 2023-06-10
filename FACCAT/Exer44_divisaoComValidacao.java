package FACCAT;

// 44) Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido 
// um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado 
// da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA).

import java.util.Scanner;

public class Exer44_divisaoComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        do {
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
        } while (valor2 == 0);

        double resultado = valor1 / valor2;

        System.out.printf("%.2f / %.2f = %.2f\n", valor1, valor2, resultado);

        scanner.close();
    }
}
