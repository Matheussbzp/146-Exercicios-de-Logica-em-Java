package FACCAT;

import java.util.Scanner;

/*
  Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
  uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
  aluno é aprovado). Escrever também a média calculada.
*/

public class Exer17_MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura das notas da primeira e segunda avaliações
        double nota1, nota2, media;

        System.out.print("Digite a nota da 1a. avaliação: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2a. avaliação: ");
        nota2 = scanner.nextDouble();

        // cálculo da média aritmética simples
        media = (nota1 + nota2) / 2;

        // verificação se o aluno foi aprovado
        if (media >= 6.0) {
            System.out.println("O aluno foi APROVADO!");
        } else {
            System.out.println("O aluno foi REPROVADO!");
        }

        // impressão da média calculada
        System.out.printf("A média do aluno foi %.2f", media);

        scanner.close();
    }
}
