package MANZANO;

import java.util.Scanner;

/**
 * Exer05B_TabuadaDeMultiplicar - Apresenta os resultados de uma tabuada de multiplicar (de 1 até 10)
 * de um número informado pelo usuário.
 */
public class Exer05B_TabuadaDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
