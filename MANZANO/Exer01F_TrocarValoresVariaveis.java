/*
 * L01F: Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B,
 * e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B
 * e a variável B passe a possuir o valor da variável A.
 * Em seguida, apresentar os valores trocados.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01F_TrocarValoresVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        String a = scanner.next();

        System.out.print("Digite o valor de B: ");
        String b = scanner.next();

        String temp = a;
        a = b;
        b = temp;

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        scanner.close();
    }
}
