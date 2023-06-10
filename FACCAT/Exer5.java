package FACCAT;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        int antecessor = valor - 1;

        System.out.println("O antecessor de " + valor + " é " + antecessor);

        scanner.close();
    }
}
