package MANZANO;

import java.util.Arrays;
import java.util.Scanner;

public class Exer02F_OrdemCrescente {
    public static void main(String[] args) {
        // Ler os valores de A, B e C
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        // Ordenar os valores em ordem crescente
        int[] valores = {a, b, c};

        Arrays.sort(valores);

        // Apresentar os valores em ordem crescente
        System.out.println("Os valores em ordem crescente são: " + valores[0] + ", " + valores[1] + " e " + valores[2]);

        scanner.close();
    }
}
