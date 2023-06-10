package MANZANO;

/**
 * Exer05E_Impares - Apresenta todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20.
 */
public class Exer05E_Impares {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
