package MANZANO;

/**
 * Exer03E_PotenciasDeTres - Apresenta os resultados das potências de 3, variando do expoente 0 até o
 * expoente 15.
 */
public class Exer03E_PotenciasDeTres {
    public static void main(String[] args) {
        int expoente = 0;
        int resultado = 1;
        while (expoente <= 15) {
            System.out.println("3^" + expoente + " = " + resultado);
            resultado *= 3;
            expoente++;
        }
    }
}
