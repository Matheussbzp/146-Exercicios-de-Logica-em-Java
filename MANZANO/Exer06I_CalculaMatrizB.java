package MANZANO;

import java.util.Scanner;

/**
 * Exer06I_CalculaMatrizB - Lê 15 elementos reais para uma matriz A de uma dimensão do tipo vetor.
 * Constrói uma matriz B de mesmo tipo e dimensão, observando a seguinte lei de formação: “Todo elemento
 * da matriz A que possuir índice par deverá ter seu elemento dividido por 2; caso contrário, o elemento
 * da matriz A deverá ser multiplicado por 1.5”. Apresentar as matrizes A e B lado a lado.
 */
public class Exer06I_CalculaMatrizB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] matrizA = new double[15];
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o valor da posição " + i + " da matriz A: ");
            double valor = scanner.nextDouble();
            matrizA[i] = valor;
        }
        double[] matrizB = new double[15];
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                matrizB[i] = matrizA[i] / 2;
            } else {
                matrizB[i] = matrizA[i] * 1.5;
            }
        }
        System.out.println("Matriz A:\tMatriz B:");
        for (int i = 0; i < 15; i++) {
            System.out.println(matrizA[i] + "\t\t" + matrizB[i]);
        }
        scanner.close();
    }
}
