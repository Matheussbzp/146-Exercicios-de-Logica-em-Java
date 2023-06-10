package MANZANO;

/**
 * Exer05G_PotenciasDeTres - Apresenta os resultados das potências de 3, variando do expoente 0 até o
 * expoente 15.
 */
public class Exer05G_PotenciasDeTres {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            int resultado = 1;
            for (int j = 1; j <= i; j++) {
                resultado *= 3;
            }
            System.out.println(resultado);
        }
    }
}
