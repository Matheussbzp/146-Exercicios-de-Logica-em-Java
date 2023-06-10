package FACCAT;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exer86 - Faça um algoritmo para ler 10 números e armazenar em um vetor.
 * Após isto, o algoritmo deve ordenar os números no vetor em ordem crescente.
 * Escrever o vetor ordenado.
 */
public class Exer86_ordenarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        Arrays.sort(numeros);

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
