package FACCAT;

import java.util.Scanner;

/*
  Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
  escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
  ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
*/

public class Exer25_SaldoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura dos dados da conta
        int numeroConta;

        System.out.print("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        double saldo, debito, credito, saldoAtual;

        System.out.print("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.print("Digite o débito da conta: ");
        debito = scanner.nextDouble();

        System.out.print("Digite o crédito da conta: ");
        credito = scanner.nextDouble();

        // cálculo do saldo atual
        saldoAtual = saldo - debito + credito;

        // impressão do número da conta e do saldo atual
        System.out.printf("Conta: %d\nSaldo atual: R$ %.2f\n", numeroConta, saldoAtual);

        // verificação do saldo atual
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        scanner.close();
    }
}
