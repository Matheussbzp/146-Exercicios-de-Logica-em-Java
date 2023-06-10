package MANZANO;

/**
 * Exer03C_SomatorioDeValoresPares - Apresenta no final o somatório dos valores pares existentes na
 * faixa de 1 até 500.
 */
public class Exer03C_SomatorioDeValoresPares {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        while (numero <= 500) {
            if (numero % 2 == 0) {
                soma += numero;
            }
            numero++;
        }
        System.out.println("A soma dos valores pares é: " + soma);
    }
}
