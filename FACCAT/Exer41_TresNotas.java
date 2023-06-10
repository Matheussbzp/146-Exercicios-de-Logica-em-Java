package FACCAT;

// Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios
// que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo e escrever o
// conceito do aluno de acordo com a tabela de conceitos.
// N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
// Média_de_Aproveitamento = ---------------------------------------------------------
//                             7
// Atribuição de conceitos:
// Média de Aproveitamento  Conceito
// >= 9,0                    A
// >= 7,5 e < 9,0            B
// >= 6,0 e < 7,5            C
// < 6,0                     D

import java.util.Scanner;

public class Exer41_TresNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura das notas e média dos exercícios
        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        // cálculo da média de aproveitamento
        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        // atribuição do conceito
        char conceito;

        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }

        // impressão do resultado
        System.out.printf("Média de aproveitamento: %.2f\n", mediaAproveitamento);
        System.out.printf("Conceito: %c\n", conceito);

        scanner.close();
    }
}
