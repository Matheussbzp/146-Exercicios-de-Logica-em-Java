/*
 * L01J: Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
 * O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário,
 * para que seja apresentado o valor em moeda brasileira.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01J_ConversaoDolarReal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorReal = quantidadeDolares * cotacaoDolar;

        System.out.printf("O valor em reais é: R$ %.2f", valorReal);

        scanner.close();
    }
}
