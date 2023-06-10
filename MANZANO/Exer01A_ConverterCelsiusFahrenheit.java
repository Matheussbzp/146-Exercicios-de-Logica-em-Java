/*
 * L01A: Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
 * A fórmula de conversão é F = (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01A_ConverterCelsiusFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("A temperatura em Fahrenheit é: %.2f°F", fahrenheit);

        scanner.close();
    }
}
