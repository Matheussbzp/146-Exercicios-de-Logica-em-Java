package MANZANO;

import java.util.Scanner;

/**
 * Exer06A_MatrizVetor - Lê 10 elementos de uma matriz tipo vetor e apresenta-os.
 */
public class Exer06A_MatrizVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matriz = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            int valor = scanner.nextInt();
            matriz[i] = valor;
        }
        for (int valor : matriz) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
