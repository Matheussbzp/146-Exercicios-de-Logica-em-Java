package MANZANO;

import java.util.Scanner;

/**
 * Exer02J_ValidacaoDeValor - Lê um valor inteiro entre 1 e 9 da entrada padrão e imprime se ele está dentro 
 * da faixa permitida ou não.
 */
public class Exer02J_ValidacaoDeValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor entre 1 e 9: ");
        int valor = scanner.nextInt();
        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }
        scanner.close();
    }
}
