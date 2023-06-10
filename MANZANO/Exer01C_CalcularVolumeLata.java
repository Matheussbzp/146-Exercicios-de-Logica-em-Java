/*
 * L01C: Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Altura * Raio * Raio * π.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01C_CalcularVolumeLata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da lata de óleo: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o raio da lata de óleo: ");
        double raio = scanner.nextDouble();

        double volume = altura * raio * raio * Math.PI;

        System.out.printf("O volume da lata de óleo é: %.2f cm³", volume);

        scanner.close();
    }
}
