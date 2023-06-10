package MANZANO;

/**
 * Exer05K_FatorialDosImpares - Apresenta o valor do fatorial dos valores ímpares situados na faixa
 * numérica de 1 a 10.
 */
public class Exer05K_FatorialDosImpares {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 2) {
            int resultado = 1;
            for (int j = 1; j <= i; j++) {
                resultado *= j;
            }
            System.out.println(i + "! = " + resultado);
        }
    }
}
