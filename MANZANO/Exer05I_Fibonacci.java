package MANZANO;

/**
 * Exer05I_Fibonacci - Apresenta a série de Fibonacci até o décimo quinto termo.
 */
public class Exer05I_Fibonacci {
    public static void main(String[] args) {
        int anterior = 1;
        int atual = 1;
        System.out.println(anterior);
        System.out.println(atual);
        for (int i = 3; i <= 15; i++) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            System.out.println(proximo);
        }
    }
}
