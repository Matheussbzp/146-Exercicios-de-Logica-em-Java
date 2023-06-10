package FACCAT;

import java.util.Scanner;

/*
  Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
  quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média
  ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque
  for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever
  a mensagem 'Efetuar compra'.
*/

public class Exer26_ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura das quantidades de estoque
        int quantidadeAtual, quantidadeMaxima, quantidadeMinima;

        System.out.print("Digite a quantidade atual em estoque: ");
        quantidadeAtual = scanner.nextInt();

        System.out.print("Digite a quantidade máxima em estoque: ");
        quantidadeMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade mínima em estoque: ");
        quantidadeMinima = scanner.nextInt();

        // cálculo da quantidade média
        double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2.0;

        // verificação da necessidade de compra
        if (quantidadeAtual < quantidadeMedia) {
            System.out.println("Efetuar compra");
        } else {
            System.out.println("Não efetuar compra");
        }

        scanner.close();
    }
}
