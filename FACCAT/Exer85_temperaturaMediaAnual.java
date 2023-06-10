package FACCAT;

import java.util.Scanner;

/**
 * Exer85 - Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano.
 * Calcular e escrever:
 * a) Menor temperatura do ano
 * b) Maior temperatura do ano
 * c) Temperatura média anual
 * d) O número de dias no ano em que a temperatura foi inferior a média anual
 */
public class Exer85_temperaturaMediaAnual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturaMedia = new double[365];

        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;
        double somaTemperaturas = 0;
        double temperaturaMediaAnual;

        for (int i = 0; i < temperaturaMedia.length; i++) {
            System.out.print("Digite a temperatura média do dia " + (i + 1) + ": ");
            temperaturaMedia[i] = scanner.nextDouble();

            if (temperaturaMedia[i] < menorTemperatura) {
                menorTemperatura = temperaturaMedia[i];
            }
            if (temperaturaMedia[i] > maiorTemperatura) {
                maiorTemperatura = temperaturaMedia[i];
            }

            somaTemperaturas += temperaturaMedia[i];
        }

        temperaturaMediaAnual = somaTemperaturas / temperaturaMedia.length;

        int diasComTemperaturaInferiorMediaAnual = 0;
        for (int i = 0; i < temperaturaMedia.length; i++) {
            if (temperaturaMedia[i] < temperaturaMediaAnual) {
                diasComTemperaturaInferiorMediaAnual++;
            }
        }

        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + temperaturaMediaAnual);
        System.out.println("Número de dias no ano em que a temperatura foi inferior à média anual: " + diasComTemperaturaInferiorMediaAnual);

        scanner.close();
    }
}
