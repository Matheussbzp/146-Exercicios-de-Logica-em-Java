package FACCAT;

import java.util.Scanner;

/*
  Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
*/

public class Exer19_MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura dos valores
        double valor1, valor2, maiorValor;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        // verificação do maior valor
        if (valor1 > valor2) {
            maiorValor = valor1;
        } else {
            maiorValor = valor2;
        }

        // impressão do maior valor
        System.out.printf("O maior valor é %.2f", maiorValor);

        scanner.close();
    }
}
