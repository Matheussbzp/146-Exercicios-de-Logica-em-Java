package FACCAT;

import java.util.Scanner;

public class Exer8_Eleicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEleitores, votosBrancos, votosNulos, votosValidos;
        double percentualBrancos, percentualNulos, percentualValidos;

        System.out.print("Digite o número total de eleitores: ");
        totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        votosBrancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        votosNulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        votosValidos = scanner.nextInt();

        percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        percentualNulos = (double) votosNulos / totalEleitores * 100;
        percentualValidos = (double) votosValidos / totalEleitores * 100;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        scanner.close();
    }
}
