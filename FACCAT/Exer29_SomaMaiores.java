package FACCAT;

import java.util.Scanner;

/*
  Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
*/

public class Exer29_SomaMaiores {
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

        // cálculo da soma dos 2 maiores valores
        double somaMaiores;

        if (valor1 > valor2 && valor1 > valor3) {
            somaMaiores = valor1 + (valor2 > valor3 ? valor2 : valor3);
        } else if (valor2 > valor1 && valor2 > valor3) {
            somaMaiores = valor2 + (valor1 > valor3 ? valor1 : valor3);
        } else {
            somaMaiores = valor3 + (valor1 > valor2 ? valor1 : valor2);
        }

        System.out.printf("Soma dos 2 maiores valores: %.2f\n", somaMaiores);

        scanner.close();
    }
}
