package FACCAT;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
  Calcular e escrever o valor do novo salário.
*/

public class Exer9_ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do salário atual e percentual de reajuste
        double salarioAtual, percentualReajuste, novoSalario;

        System.out.print("Digite o salário mensal atual do funcionário: R$");
        salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        percentualReajuste = scanner.nextDouble();

        // cálculo do novo salário com reajuste
        novoSalario = salarioAtual * (1 + percentualReajuste / 100);

        // impressão do novo salário
        System.out.printf("O novo salário do funcionário é R$%.2f", novoSalario);

        scanner.close();
    }
}
