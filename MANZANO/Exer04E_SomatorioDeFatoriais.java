package MANZANO;

import java.util.Scanner;

/**
 * Exer04E_SomatorioDeFatoriais - Efetua a leitura de 15 valores numéricos inteiros e no final
 * apresenta o total do somatório da fatorial de cada valor lido.
 */
public class Exer04E_SomatorioDeFatoriais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valoresLidos = 0;
        int somatorioFatoriais = 0;
        while (valoresLidos < 15) {
            System.out.print("Digite um valor inteiro: ");
            int valor = scanner.nextInt();
            somatorioFatoriais += fatorial(valor);
            valoresLidos++;
        }
        System.out.println("O somatório das fatoriais é: " + somatorioFatoriais);
        scanner.close();
    }

    private static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }
}
