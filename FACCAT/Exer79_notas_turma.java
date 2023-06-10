package FACCAT;

import java.util.Scanner;

// Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos. Calcular a média da turma 
// e contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da turma e o resultado da contagem.

public class Exer79_notas_turma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int quantidadeAlunos = 20;

        double somaNotas = 0;
        double mediaTurma;
        int quantidadeAcimaMedia = 0;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno #" + i + ": ");
            double nota = scanner.nextDouble();

            somaNotas += nota;
        }

        mediaTurma = somaNotas / quantidadeAlunos;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno #" + i + ": ");
            double nota = scanner.nextDouble();

            if (nota > mediaTurma) {
                quantidadeAcimaMedia++;
            }
        }

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Quantidade de alunos acima da média: " + quantidadeAcimaMedia);

        scanner.close();
    }
}
