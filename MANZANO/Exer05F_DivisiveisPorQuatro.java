package MANZANO;

/**
 * Exer05F_DivisiveisPorQuatro - Apresenta todos os números divisíveis por 4 que sejam menores que 200.
 */
public class Exer05F_DivisiveisPorQuatro {
    public static void main(String[] args) {
        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
