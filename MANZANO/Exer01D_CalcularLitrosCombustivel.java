/*
 * L01D: Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem,
 * utilizando um automóvel que faz 12 km por litro. Para obter o cálculo, o usuário deve fornecer
 * o tempo gasto (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível
 * obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
 * Possuindo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem
 * com a fórmula LITROS_USADOS = DISTANCIA / 12.
 * Ao final, o programa deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem
 * (TEMPO), a distância percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.
 */

package MANZANO;

import java.util.Scanner;

public class Exer01D_CalcularLitrosCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;

        System.out.printf("Velocidade média: %.2f km/h\n", velocidade);
        System.out.printf("Tempo gasto: %.2f horas\n", tempo);
        System.out.printf("Distância percorrida: %.2f km\n", distancia);
        System.out.printf("Litros de combustível utilizados: %.2f L", litrosUsados);

        scanner.close();
    }
}
