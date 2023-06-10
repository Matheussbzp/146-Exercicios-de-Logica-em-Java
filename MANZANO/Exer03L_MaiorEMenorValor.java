package MANZANO;

import java.util.Scanner;

/**
 * Exer03L_MaiorEMenorValor - Efetua a leitura de valores positivos inteiros até que um valor negativo
 * seja informado. Ao final são apresentados o maior e o menor valores informados pelo usuário.
 */
public class Exer03L_MaiorEMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        boolean primeiroValor = true;
        int valor;
        do {
            System.out.print("Digite um valor inteiro positivo (ou negativo para sair): ");
            valor = scanner.nextInt();
            if (valor >= 0) {
                if (primeiroValor) {
                    maior = valor;
                    menor = valor;
                    primeiroValor = false;
                } else {
                    if (valor > maior) {
                        maior = valor;
                    }
                    if (valor < menor) {
                        menor = valor;
                    }
                }
            }
        } while (valor >= 0);
        if (primeiroValor) {
            System.out.println("Nenhum valor foi informado");
        } else {
            System.out.println("O maior valor informado foi: " + maior);
            System.out.println("O menor valor informado foi: " + menor);
        }
        scanner.close();
    }
}
