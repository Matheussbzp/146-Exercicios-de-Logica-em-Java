package MANZANO;

import java.util.Scanner;

/**
 * Exer02K_ApresentacaoDeValor - Lê um valor inteiro e o apresenta, caso não seja maior que três.
 */
public class Exer02K_ApresentacaoDeValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();
        if (valor <= 3) {
            System.out.println("O valor é " + valor);
        }
        scanner.close();
    }
}