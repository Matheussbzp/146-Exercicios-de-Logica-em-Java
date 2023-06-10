package FACCAT;

// 62) Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos, calcular e 
// escrever a média aritmética dessas notas lidas.

import java.util.Scanner;

public class Exer62_mediaAritmeticaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= numAlunos; i++) {
            System.out.printf("Digite a nota do %dº aluno: ", i);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / numAlunos;

        System.out.printf("A média aritmética das notas é %.2f.\n", media);

        scanner.close();
    }
}
