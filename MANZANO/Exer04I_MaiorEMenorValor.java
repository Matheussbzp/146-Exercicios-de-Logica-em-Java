package MANZANO;

import java.util.Scanner;

/**
 * Exer04I_MaiorEMenorValor - Efetua a leitura de valores positivos inteiros até que um valor negativo
 * seja informado. Ao final são apresentados o maior e o menor valores informados pelo usuário.
 */
public class Exer04I_MaiorEMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorValor = -1;
        int menorValor = -1;
        int valor;
        System.out.print("Digite um valor inteiro positivo (ou negativo para sair): ");
        valor = scanner.nextInt();

        while (valor >= 0) {
            if (maiorValor == -1 || valor > maiorValor) {
                maiorValor = valor;
            }
            if (menorValor == -1 || valor < menorValor) {
                menorValor = valor;
            }
            System.out.print("Digite um valor inteiro positivo (ou negativo para sair): ");
            valor = scanner.nextInt();
        }

        if (maiorValor == -1 && menorValor == -1) {
            System.out.println("Nenhum valor positivo foi informado");
        } else {
            System.out.println("O maior valor informado foi: " + maiorValor);
            System.out.println("O menor valor informado foi: " + menorValor);
        }
        scanner.close();
    }
}
