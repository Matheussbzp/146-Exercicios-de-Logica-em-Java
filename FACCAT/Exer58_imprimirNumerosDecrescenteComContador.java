package FACCAT;

// 58) Reescreva o exercício 51 utilizando a estrutura ENQUANTO e um CONTADOR.

public class Exer58_imprimirNumerosDecrescenteComContador {
    public static void main(String[] args) {
        int contador = 10;
        while (contador >= 1) {
            System.out.print(contador + " ");
            contador--;
        }
        System.out.println();
    }
}
