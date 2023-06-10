package FACCAT;

import java.util.Scanner;

/*
  As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas
  pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva
  o custo total da compra.
*/

public class Exer16_CustoMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do número de maçãs compradas
        int numMacas;
        double custoTotal;

        System.out.print("Digite o número de maçãs compradas: ");
        numMacas = scanner.nextInt();

        // cálculo do custo total da compra
        if (numMacas < 12) {
            custoTotal = numMacas * 1.30;
        } else {
            custoTotal = numMacas * 1.00;
        }

        // impressão do custo total da compra
        System.out.printf("O custo total da compra é R$%.2f", custoTotal);

        scanner.close();
    }
}
