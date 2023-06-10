package FACCAT;

// 59) Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.

import java.util.Scanner;

public class Exer59_contarNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contNegativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            int valor = scanner.nextInt();
            if (valor < 0) {
                contNegativos++;
            }
        }

        System.out.printf("Foram digitados %d valores negativos.\n", contNegativos);

        scanner.close();
    }
}
