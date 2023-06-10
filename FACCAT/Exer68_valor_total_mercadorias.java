package FACCAT;

import java.util.Scanner;

// Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a entrada das seguintes informações: 
// a) o número total de mercadorias no estoque; 
// b) o valor de cada mercadoria. 
// Ao final imprimir o valor total em estoque e a média de valor das mercadorias.

public class Exer68_valor_total_mercadorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de mercadorias no estoque: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o valor de cada mercadoria: ");
        double valor = scanner.nextDouble();

        double valorTotal = quantidade * valor;
        double mediaValor = valor;

        System.out.println("O valor total em estoque é de: " + valorTotal);
        System.out.println("A média de valor das mercadorias é de: " + mediaValor);

        scanner.close();
    }
}
