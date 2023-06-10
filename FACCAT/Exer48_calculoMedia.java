package FACCAT;

// 48) Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a 
// média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada 
// nota.

import java.util.Scanner;

public class Exer48_calculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2;

        do {
            System.out.print("Digite a nota da 1a. avaliação (0 a 10): ");
            nota1 = scanner.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a nota da 2a. avaliação (0 a 10): ");
            nota2 = scanner.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;

        System.out.printf("Média do aluno: %.2f\n", media);

        scanner.close();
    }
}
