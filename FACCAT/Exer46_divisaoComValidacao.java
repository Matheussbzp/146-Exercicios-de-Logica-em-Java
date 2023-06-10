package FACCAT;

// 46) Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [44] caso o segundo valor 
// informado seja ZERO.

import java.util.Scanner;

public class Exer46_divisaoComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        do {
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
            if (valor2 == 0) {
                System.out.println("VALOR INVÁLIDO");
            }
        } while (valor2 == 0);

        double resultado = valor1 / valor2;

        System.out.printf("%.2f / %.2f = %.2f\n", valor1, valor2, resultado);

        scanner.close();
    }
}
