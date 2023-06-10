package MANZANO;

import java.util.Scanner;

public class Exer02I_ParImpar {
    public static void main(String[] args) {
        // Ler o número inteiro
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        scanner.close();
    }
}
