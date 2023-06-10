package MANZANO;

import java.util.Scanner;

/**
 * Exer03I_SomatorioEMediaAritmetica - Efetua a leitura de 10 valores numéricos e apresenta no final
 * o total do somatório e a média aritmética dos valores lidos.
 */
public class Exer03I_SomatorioEMediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int somatorio = 0;
        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º valor: ");
            int valor = scanner.nextInt();
            somatorio += valor;
            contador++;
        }
        double media = (double) somatorio / 10.0;
        System.out.println("O somatório dos valores é: " + somatorio);
        System.out.println("A média aritmética dos valores é: " + media);
        scanner.close();
    }
}
