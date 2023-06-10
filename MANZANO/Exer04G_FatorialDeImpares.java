package MANZANO;

/**
 * Exer04G_FatorialDeImpares - Apresenta como resultado o valor do fatorial dos valores ímpares
 * situados na faixa numérica de 1 a 10.
 */
public class Exer04G_FatorialDeImpares {
    public static void main(String[] args) {
        int numero = 1;
        int fatorialImpares = 1;
        while (numero <= 10) {
            if (numero % 2 != 0) {
                fatorialImpares *= numero;
            }
            numero++;
        }
        System.out.println("O fatorial dos valores ímpares é: " + fatorialImpares);
    }
}
