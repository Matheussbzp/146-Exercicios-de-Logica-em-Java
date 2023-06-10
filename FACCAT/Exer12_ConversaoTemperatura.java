package FACCAT;

import java.util.Scanner;

/*
  Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
  correspondente em graus Celsius (baseado na fórmula abaixo):
  C = (F - 32) * 5 / 9
*/

public class Exer12_ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura da temperatura em Fahrenheit
        double temperaturaFahrenheit, temperaturaCelsius;

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        temperaturaFahrenheit = scanner.nextDouble();

        // cálculo da temperatura em Celsius
        temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

        // impressão da temperatura em Celsius
        System.out.printf("A temperatura em graus Celsius é %.2f", temperaturaCelsius);

        scanner.close();
    }
}
