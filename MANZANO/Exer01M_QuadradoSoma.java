/*
 * L01M: Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final
 * o quadrado da soma dos três valores lidos.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01M_QuadradoSoma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        int soma = a + b + c;
        int quadradoSoma = soma * soma;

        System.out.printf("O quadrado da soma de A, B e C é: %d", quadradoSoma);

        scanner.close();
    }
}
