package MANZANO;

/**
 * Exer05D_SomaDePares - Apresenta no final o somatório dos valores pares existentes na faixa de 1 até
 * 500.
 */
public class Exer05D_SomaDePares {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
