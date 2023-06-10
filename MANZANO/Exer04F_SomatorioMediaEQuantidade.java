package MANZANO;

import java.util.Scanner;

/**
 * Exer04F_SomatorioMediaEQuantidade - Efetua a leitura sucessiva de valores numéricos e apresenta no
 * final o total do somatório, a média aritmética e o total de valores lidos. O programa faz as leituras
 * dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa para quando
 * o usuário fornecer um valor negativo. Cuidado com a divisão por zero no cálculo da média.
 */
public class Exer04F_SomatorioMediaEQuantidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeValores = 0;
        int somatorioValores = 0;
        int valor;
        do {
            System.out.print("Digite um valor inteiro positivo (ou negativo para sair): ");
            valor = scanner.nextInt();
            if (valor >= 0) {
                somatorioValores += valor;
                quantidadeValores++;
            }
        } while (valor >= 0);
        if (quantidadeValores == 0) {
            System.out.println("Nenhum valor foi informado");
        } else {
            double mediaValores = (double) somatorioValores / quantidadeValores;
            System.out.println("O somatório dos valores é: " + somatorioValores);
            System.out.println("A média dos valores é: " + mediaValores);
            System.out.println("A quantidade de valores lidos é: " + quantidadeValores);
        }
        scanner.close();
    }
}
