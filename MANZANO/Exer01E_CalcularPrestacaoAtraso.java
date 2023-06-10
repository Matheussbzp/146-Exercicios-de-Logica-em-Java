/*
 * L01E: Efetuar o cálculo e a apresentação do valor de uma prestação em atraso,
 * utilizando a fórmula PRESTACAO = VALOR + (VALOR * TAXA/100) * TEMPO.
 * O usuário deve fornecer o valor da prestação (VALOR), a taxa de juros (TAXA) e o tempo de atraso (TEMPO).
 */

package MANZANO;

import java.util.Scanner;

public class Exer01E_CalcularPrestacaoAtraso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação em atraso: R$");
        double valor = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        double taxa = scanner.nextDouble();

        System.out.print("Digite o tempo de atraso (em meses): ");
        double tempo = scanner.nextDouble();

        double prestacao = valor + (valor * taxa/100) * tempo;

        System.out.printf("O valor da prestação em atraso é: R$%.2f", prestacao);

        scanner.close();
    }
}
