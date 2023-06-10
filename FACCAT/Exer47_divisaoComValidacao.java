package FACCAT;

// 47) Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [45] caso o segundo valor 
// informado seja ZERO.

import java.util.Scanner;

public class Exer47_divisaoComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor (não pode ser zero): ");
        valor2 = scanner.nextDouble();

        while (valor2 == 0) {
            System.out.println("VALOR INVÁLIDO");
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
        }

        double resultado = valor1 / valor2;

        System.out.printf("%.2f / %.2f = %.2f\n", valor1, valor2, resultado);

        scanner.close();
    }
}
