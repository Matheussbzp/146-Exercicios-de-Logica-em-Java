package FACCAT;

import java.util.Scanner;

/*
  Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
  mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
  efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
  vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final
  do vendedor.
*/

public class Exer11_SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura dos dados do vendedor
        int numCarrosVendidos;
        double valorTotalVendas, salarioFixo, valorPorCarro, salarioFinal;

        System.out.print("Digite o número de carros vendidos pelo vendedor: ");
        numCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total de vendas do vendedor: R$");
        valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: R$");
        salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor que o vendedor recebe por carro vendido: R$");
        valorPorCarro = scanner.nextDouble();

        // cálculo do salário final do vendedor
        salarioFinal = salarioFixo + numCarrosVendidos * valorPorCarro + valorTotalVendas * 0.05;

        // impressão do salário final do vendedor
        System.out.printf("O salário final do vendedor é R$%.2f", salarioFinal);

        scanner.close();
    }
}
