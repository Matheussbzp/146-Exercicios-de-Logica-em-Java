package FACCAT;

// 49) Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final do exercício [48]. Se for 
// respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o algoritmo.

import java.util.Scanner;

public class Exer49_calculoMediaComRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char resposta;

        do {
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

            System.out.print("NOVO CÁLCULO (S/N)? ");
            resposta = scanner.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        scanner.close();
    }
}
