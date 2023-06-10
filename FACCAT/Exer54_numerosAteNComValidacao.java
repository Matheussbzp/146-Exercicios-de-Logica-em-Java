package FACCAT;

// 54) Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor 
// informado (para N) não seja maior que 0, deverá ser lido um novo valor para N.

import java.util.Scanner;

public class Exer54_numerosAteNComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um número inteiro N maior que 0: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
