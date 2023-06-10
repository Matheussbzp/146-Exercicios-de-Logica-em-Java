package FACCAT;

// 56) Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor 
// lido.

import java.util.Scanner;

public class Exer56_tabuadaDeValorLido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        do {
            System.out.print("Digite um valor inteiro entre 1 e 10: ");
            valor = scanner.nextInt();
        } while (valor < 1 || valor > 10);

        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.printf("%d x %d = %d\n", valor, i, resultado);
        }

        scanner.close();
    }
}
