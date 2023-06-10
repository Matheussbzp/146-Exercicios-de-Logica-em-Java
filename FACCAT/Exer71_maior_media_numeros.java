package FACCAT;

import java.util.Scanner;

// Faça um algoritmo para ler uma quantidade e a seguir ler esta quantidade de números. 
// Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média dos números lidos.

public class Exer71_maior_media_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que serão lidos: ");
        int quantidade = scanner.nextInt();

        int maiorValor = Integer.MIN_VALUE;
        int somaValores = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o valor #" + i + ": ");
            int valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            somaValores += valor;
        }

        double mediaValores = somaValores / (double)quantidade;

        System.out.println("O maior valor lido foi: " + maiorValor);
        System.out.println("A média dos valores lidos foi: " + mediaValores);

        scanner.close();
    }
}
