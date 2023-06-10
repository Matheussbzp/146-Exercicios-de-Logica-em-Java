package FACCAT;

import java.util.Scanner;

/*
  Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
*/

public class Exer20_OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura dos valores
        double valor1, valor2, menorValor, maiorValor;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        // determinação do menor e do maior valor
        if (valor1 < valor2) {
            menorValor = valor1;
            maiorValor = valor2;
        } else {
            menorValor = valor2;
            maiorValor = valor1;
        }

        // impressão dos valores em ordem crescente
        System.out.printf("Os valores em ordem crescente são %.2f e %.2f", menorValor, maiorValor);

        scanner.close();
    }
}
