package FACCAT;

import java.util.Scanner;

/*
  Faça um algoritmo para ler a descrição do produto (nome), a quantidade adquirida e o preço unitário.
  Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a
  pagar (total a pagar = total - desconto), sabendo-se que:
  - Se quantidade <= 5 o desconto será de 2%
  - Se quantidade > 5 e quantidade <= 10 o desconto será de 3%
  - Se quantidade > 10 o desconto será de 5%
*/

public class Exer40_CalculoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura da descrição do produto, quantidade adquirida e preço unitário
        String produto;
        int quantidade;
        double preco;

        System.out.print("Digite a descrição do produto: ");
        produto = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: R$ ");
        preco = scanner.nextDouble();

        // cálculo do total, desconto e total a pagar
        double total = quantidade * preco;
        double desconto;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalPagar = total - desconto;

        // impressão dos resultados
        System.out.printf("Produto: %s\n", produto);
        System.out.printf("Quantidade adquirida: %d\n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f\n", preco);
        System.out.printf("Total: R$ %.2f\n", total);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);

        scanner.close();
    }
}
