/*
 * L01G: Ler quatro números inteiros e apresentar o resultado da adição e multiplicação,
 * baseando-se na utilização do conceito da propriedade distributiva.
 * Ou seja, se forem lidas as variáveis A, B, C e D, devem ser somadas e multiplicadas A com B,
 * A com C e A com D. Depois B com C, B com D e por fim C com D.
 * Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação
 * e apresentar doze resultados de saída.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01G_PropriedadeDistributiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        int d = scanner.nextInt();

        int somaAB = a + b;
        int somaAC = a + c;
        int somaAD = a + d;
        int somaBC = b + c;
        int somaBD = b + d;
        int somaCD = c + d;

        int multAB = a * b;
        int multAC = a * c;
        int multAD = a * d;
        int multBC = b * c;
        int multBD = b * d;
        int multCD = c * d;

        System.out.printf("Soma A+B: %d\n", somaAB);
        System.out.printf("Soma A+C: %d\n", somaAC);
        System.out.printf("Soma A+D: %d\n", somaAD);
        System.out.printf("Soma B+C: %d\n", somaBC);
        System.out.printf("Soma B+D: %d\n", somaBD);
        System.out.printf("Soma C+D: %d\n", somaCD);

        System.out.printf("Multiplicação A*B: %d\n", multAB);
        System.out.printf("Multiplicação A*C: %d\n", multAC);
        System.out.printf("Multiplicação A*D: %d\n", multAD);
        System.out.printf("Multiplicação B*C: %d\n", multBC);
        System.out.printf("Multiplicação B*D: %d\n", multBD);
        System.out.printf("Multiplicação C*D: %d\n", multCD);

        scanner.close();
    }
}
