package FACCAT;

import java.util.Scanner;

/*
  Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
  Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo
  da média final é:
  n1 * 2 + n2 * 3 + n3 * 5
  mediafinal = -------------------
                  10
*/

public class Exer13_MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura das três notas do aluno
        double nota1, nota2, nota3, mediaFinal;

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = scanner.nextDouble();

        // cálculo da média final ponderada
        mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

        // impressão da média final
        System.out.printf("A média final do aluno é %.2f", mediaFinal);

        scanner.close();
    }
}
