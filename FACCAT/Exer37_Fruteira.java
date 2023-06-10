package FACCAT;

import java.util.Scanner;

/*
  Uma fruteira está vendendo frutas com a seguinte tabela de preços:
  - Até 5 Kg - Morango R$ 2,50 por Kg / Maçã R$ 1,80 por Kg
  - Acima de 5 Kg - Morango R$ 2,20 por Kg / Maçã R$ 1,50 por Kg

  Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
  receberá ainda um desconto de 10% sobre este total.

  Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças
  adquiridas e escreva o valor a ser pago pelo cliente.
*/

public class Exer37_Fruteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura da quantidade (em Kg) de morangos e maçãs
        double morangos, macas;

        System.out.print("Digite a quantidade (em Kg) de morangos: ");
        morangos = scanner.nextDouble();

        System.out.print("Digite a quantidade (em Kg) de maçãs: ");
        macas = scanner.nextDouble();

        // cálculo do valor a ser pago com desconto
        double valor, desconto;

        if (morangos <= 5) {
            valor = morangos * 2.5;
        } else {
            valor = morangos * 2.2;
        }

        if (macas <= 5) {
            valor += macas * 1.8;
        } else {
            valor += macas * 1.5;
        }

        if ((morangos + macas) > 8 || valor > 25) {
            desconto = valor * 0.1;
        } else {
            desconto = 0;
        }

        double valorFinal = valor - desconto;

        System.out.printf("Valor a ser pago: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
