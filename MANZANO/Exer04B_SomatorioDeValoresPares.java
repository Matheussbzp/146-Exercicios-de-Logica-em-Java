package MANZANO;

/**
 * Exer04B_SomatorioDeValoresPares - Apresenta no final o somatório dos valores pares existentes na
 * faixa de 1 até 500.
 */
public class Exer04B_SomatorioDeValoresPares {
    public static void main(String[] args) {
        int numero = 1;
        int somatorio = 0;
        do {
            if (numero % 2 == 0) {
                somatorio += numero;
            }
            numero++;
        } while (numero <= 500);
        System.out.println("O somatório dos valores pares é: " + somatorio);
    }
}
