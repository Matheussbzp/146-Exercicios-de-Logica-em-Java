package FACCAT;

// 53) Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere 
// que o N será sempre maior que ZERO.

import java.util.Scanner;

public class Exer53_numerosAteN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
