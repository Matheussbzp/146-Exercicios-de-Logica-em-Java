package MANZANO;

import java.util.Scanner;

/**
 * Exer04H_AreaResidencial - Possibilita calcular a área total de uma residência (sala, cozinha,
 * banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa solicita a entrada do nome,
 * a largura e o comprimento de um determinado cômodo. Em seguida, apresenta a área do cômodo lido
 * e também uma mensagem solicitando do usuário a confirmação de continuar calculando novos
 * cômodos. Caso o usuário responda "NAO", o programa apresenta o valor total acumulado da área
 * residencial.
 */
public class Exer04H_AreaResidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0.0;
        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.next();
            System.out.print("Digite a largura do cômodo (em metros): ");
            double larguraComodo = scanner.nextDouble();
            System.out.print("Digite o comprimento do cômodo (em metros): ");
            double comprimentoComodo = scanner.nextDouble();
            double areaComodo = larguraComodo * comprimentoComodo;
            System.out.println("A área do cômodo " + nomeComodo + " é: " + areaComodo + " m²");
            areaTotal += areaComodo;
            System.out.print("Deseja continuar calculando novos cômodos? (SIM/NAO): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("NAO")) {
                continuar = false;
            }
        }
        System.out.println("A área total da residência é: " + areaTotal + " m²");
        scanner.close();
    }
}
