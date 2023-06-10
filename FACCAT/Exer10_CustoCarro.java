package FACCAT;

import java.util.Scanner;

/*
  O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
  do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
  do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo
  de fábrica de um carro, calcular e escrever o custo final ao consumidor.
*/

public class Exer10_CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do custo de fábrica
        double custoFabrica, custoFinal;

        System.out.print("Digite o custo de fábrica do carro: R$");
        custoFabrica = scanner.nextDouble();

        // cálculo do custo final ao consumidor
        custoFinal = custoFabrica * (1 + 0.28 + 0.45);

        // impressão do custo final
        System.out.printf("O custo final do carro ao consumidor é R$%.2f", custoFinal);

        scanner.close();
    }
}
