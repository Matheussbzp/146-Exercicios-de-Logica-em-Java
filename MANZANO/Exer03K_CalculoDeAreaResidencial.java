package MANZANO;

import java.util.Scanner;

/**
 * Exer03K_CalculoDeAreaResidencial - Possibilita calcular a área total de uma
 * residência (sala,
 * cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.). O
 * programa solicita a entrada
 * do nome, a largura e o comprimento de cada cômodo. Em seguida, apresenta a
 * área do cômodo lido e
 * também uma mensagem solicitando do usuário a confirmação de continuar
 * calculando novos cômodos.
 * Caso o usuário responda "NAO", o programa apresenta o valor total acumulado
 * da área residencial.
 */
public class Exer03K_CalculoDeAreaResidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0.0;
        String resposta;
        do {
            System.out.print("Digite o nome do cômodo: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = scanner.nextDouble();
            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = scanner.nextDouble();
            scanner.nextLine();
            double area = largura * comprimento;
            areaTotal += area;
            System.out.println("A área do cômodo " + nome + " é: " + area + "m²");
            System.out.print("Deseja continuar calculando novos cômodos? (SIM/NAO) ");
            resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("SIM"));
        System.out.println("A área total da residência é: " + areaTotal + "m²");
        scanner.close();
    }
}
