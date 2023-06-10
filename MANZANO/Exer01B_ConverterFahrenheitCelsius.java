/*
 * L01B: Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
 * A fórmula de conversão é C = (F - 32) * (5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01B_ConverterFahrenheitCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * (5/9.0);

        System.out.printf("A temperatura em Celsius é: %.2f°C", celsius);

        scanner.close();
    }
}
