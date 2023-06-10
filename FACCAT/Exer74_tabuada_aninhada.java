package FACCAT;

// Escreva um algoritmo que imprima a tabuada (de 1 a 10) para os números de 1 a 10. (usando repetiçção aninhada)

public class Exer74_tabuada_aninhada {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
