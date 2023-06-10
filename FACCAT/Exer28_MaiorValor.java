package FACCAT;

import java.util.Scanner;

/*
  Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
*/

public class Exer28_MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura dos valores
        double valor1, valor2, valor3;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextDouble();

        // verificação do maior valor
        double maiorValor = valor1;

        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }

        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }

        System.out.printf("Maior valor: %.2f\n", maiorValor);

        scanner.close();
    }
}
