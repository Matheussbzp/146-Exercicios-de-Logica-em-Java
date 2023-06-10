package FACCAT;

import java.util.Scanner;

/*
  Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
*/

public class Exer15_PosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do valor
        int valor;

        System.out.print("Digite um valor: ");
        valor = scanner.nextInt();

        // verificação se o valor é positivo ou negativo
        if (valor >= 0) {
            System.out.println("O valor é POSITIVO!");
        } else {
            System.out.println("O valor é NEGATIVO!");
        }

        scanner.close();
    }
}
