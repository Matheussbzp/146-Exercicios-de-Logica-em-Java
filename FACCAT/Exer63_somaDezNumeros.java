package FACCAT;

// 63) Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.

import java.util.Scanner;

public class Exer63_somaDezNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.printf("A soma dos 10 números é %d.\n", soma);

        scanner.close();
    }
}
