/*
 * L01H: Elaborar um programa que calcule e apresente o volume de uma caixa retangular,
 * por meio da fórmula VOLUME = COMPRIMENTO * LARGURA * ALTURA.
 * O usuário deve fornecer os valores de comprimento, largura e altura da caixa.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01H_CalcularVolumeCaixa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double altura = scanner.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.printf("O volume da caixa é: %.2f", volume);

        scanner.close();
    }
}
