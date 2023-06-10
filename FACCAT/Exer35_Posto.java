package FACCAT;

import java.util.Scanner;

/*
  Um posto está vendendo combustíveis com a seguinte tabela de descontos:
  - até 20 litros, desconto de 3% por litro Álcool
  - acima de 20 litros, desconto de 5% por litro Álcool
  - até 20 litros, desconto de 4% por litro Gasolina
  - acima de 20 litros, desconto de 6% por litro Gasolina

  Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
  seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
  que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
*/

public class Exer35_Posto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do número de litros vendidos e do tipo de combustível
        int litros;
        char tipo;

        System.out.print("Digite o número de litros vendidos: ");
        litros = scanner.nextInt();

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        tipo = scanner.next().charAt(0);

        // cálculo do valor a ser pago com desconto
        double valor, desconto;

        if (tipo == 'A') {
            if (litros <= 20) {
                valor = litros * 2.9;
                desconto = valor * 0.03;
            } else {
                valor = litros * 2.9;
                desconto = valor * 0.05;
            }
        } else {
            if (litros <= 20) {
                valor = litros * 3.3;
                desconto = valor * 0.04;
            } else {
                valor = litros * 3.3;
                desconto = valor * 0.06;
            }
        }

        double valorFinal = valor - desconto;

        System.out.printf("Valor a ser pago: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
