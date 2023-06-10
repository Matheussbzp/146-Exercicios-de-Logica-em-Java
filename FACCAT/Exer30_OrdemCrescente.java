package FACCAT;

import java.util.Scanner;

/*
  Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.
*/

public class Exer30_OrdemCrescente {
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

        // ordenação dos valores em ordem crescente
        double menorValor, valorMedio, maiorValor;

        if (valor1 < valor2 && valor1 < valor3) {
            menorValor = valor1;
            if (valor2 < valor3) {
                valorMedio = valor2;
                maiorValor = valor3;
            } else {
                valorMedio = valor3;
                maiorValor = valor2;
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            menorValor = valor2;
            if (valor1 < valor3) {
                valorMedio = valor1;
                maiorValor = valor3;
            } else {
                valorMedio = valor3;
                maiorValor = valor1;
            }
        } else {
            menorValor = valor3;
            if (valor1 < valor2) {
                valorMedio = valor1;
                maiorValor = valor2;
            } else {
                valorMedio = valor2;
                maiorValor = valor1;
            }
        }

        System.out.printf("%.2f, %.2f, %.2f\n", menorValor, valorMedio, maiorValor);

        scanner.close();
    }
}
