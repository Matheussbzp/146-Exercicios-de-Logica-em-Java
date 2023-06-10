package FACCAT;

import java.util.Scanner;

// O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. 
// Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS MERCADORIAS (S/N)?’. 
// Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em estoque.

public class Exer69_valor_total_mercadorias_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        double valorTotal = 0;

        char continua = 'S';
        while (continua == 'S') {
            System.out.print("Digite o valor da mercadoria: ");
            double valor = scanner.nextDouble();

            quantidade++;
            valorTotal += valor;

            System.out.print("MAIS MERCADORIAS (S/N)? ");
            continua = scanner.next().charAt(0);
        }

        double mediaValor = valorTotal / quantidade;

        System.out.println("O valor total em estoque é de: " + valorTotal);
        System.out.println("A média de valor das mercadorias é de: " + mediaValor);

        scanner.close();
    }
}
