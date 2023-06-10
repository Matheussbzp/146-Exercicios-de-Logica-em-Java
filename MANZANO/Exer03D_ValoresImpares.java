package MANZANO;

/**
 * Exer03D_ValoresImpares - Apresenta todos os valores numéricos inteiros ímpares situados na faixa
 * de 0 a 20.
 */
public class Exer03D_ValoresImpares {
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 20) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
