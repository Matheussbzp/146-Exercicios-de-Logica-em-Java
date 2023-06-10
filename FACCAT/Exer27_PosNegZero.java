package FACCAT;

import java.util.Scanner;

/*
  Ler um valor e escrever se é positivo, negativo ou zero.
*/

public class Exer27_PosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do valor
        double valor;

        System.out.print("Digite um valor: ");
        valor = scanner.nextDouble();

        // verificação se é positivo, negativo ou zero
        if (valor > 0) {
            System.out.println("Valor positivo");
        } else if (valor < 0) {
            System.out.println("Valor negativo");
        } else {
            System.out.println("Valor zero");
        }

        scanner.close();
    }
}
