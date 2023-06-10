package MANZANO;

import java.util.Scanner;

/**
 * Exer03A_TabuadaDeMultiplicacao - Apresenta os resultados de uma tabuada de multiplicação (de 1 até 10)
 * de um número qualquer.
 */
public class Exer03A_TabuadaDeMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int contador = 1;
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
        scanner.close();
    }
}
