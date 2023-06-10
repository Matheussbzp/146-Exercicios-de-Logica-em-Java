package MANZANO;

import java.util.Scanner;

/**
 * Exer05H_Potencia - Apresenta o valor de uma potência de uma base qualquer elevada a um expoente
 * qualquer.
 */
public class Exer05H_Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);
        scanner.close();
    }
}
