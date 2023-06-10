/*
 * L01K: Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real.
 * O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário,
 * para que seja apresentado o valor em moeda americana.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01K_ConversaoRealDolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de reais: ");
        double quantidadeReais = scanner.nextDouble();

        double valorDolar = quantidadeReais / cotacaoDolar;

        System.out.printf("O valor em dólares é: U$ %.2f", valorDolar);

        scanner.close();
    }
}
