package MANZANO;

/**
 * L04A_QuadradosDeNumeros - Apresenta os quadrados dos números inteiros de 15 a 200.
 */
public class Exer04A_QuadradosDeNumeros {
    public static void main(String[] args) {
        int numero = 15;
        do {
            System.out.println(numero * numero);
            numero++;
        } while (numero <= 200);
    }
}
