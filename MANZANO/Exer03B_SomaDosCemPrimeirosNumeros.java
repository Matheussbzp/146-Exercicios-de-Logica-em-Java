package MANZANO;

/**
 * Exer03B_SomaDosCemPrimeirosNumeros - Apresenta o total da soma obtida dos cem primeiros números
 * inteiros (1+2+3+4+...+98+99+100).
 */
public class Exer03B_SomaDosCemPrimeirosNumeros {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        while (numero <= 100) {
            soma += numero;
            numero++;
        }
        System.out.println("A soma dos cem primeiros números é: " + soma);
    }
}
