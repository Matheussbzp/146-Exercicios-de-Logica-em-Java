package FACCAT;

import java.util.Scanner;

/*
  Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
  ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
  ultrapassar este valor, calcular e escrever o seu salário total.
*/

public class Exer24_SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do salário fixo e do valor das vendas
        double salarioFixo, valorVendas, comissao, salarioTotal;

        System.out.print("Digite o salário fixo: ");
        salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas: ");
        valorVendas = scanner.nextDouble();

        // cálculo da comissão
        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
        }

        // cálculo do salário total
        salarioTotal = salarioFixo + comissao;

        // impressão do salário total
        System.out.printf("O salário total do vendedor é R$ %.2f", salarioTotal);

        scanner.close();
    }
}
