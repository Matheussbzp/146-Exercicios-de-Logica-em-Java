package FACCAT;

import java.util.Scanner;

// Faça um algoritmo para ler o código e o preço de 15 produtos, calcular e escrever: 
// - o maior preço lido 
// - a média aritmética dos preços dos produtos

public class Exer72_maior_media_precos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeProdutos = 15;
        double maiorPreco = Double.MIN_VALUE;
        double somaPrecos = 0;

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Digite o código do produto #" + i + ": ");
            scanner.nextInt();

            System.out.print("Digite o preço do produto #" + i + ": ");
            double preco = scanner.nextDouble();

            if (preco > maiorPreco) {
                maiorPreco = preco;
            }

            somaPrecos += preco;
        }

        double mediaPrecos = somaPrecos / quantidadeProdutos;

        System.out.println("O maior preço lido foi: " + maiorPreco);
        System.out.println("A média dos preços dos produtos é: " + mediaPrecos);

        scanner.close();
    }
}
