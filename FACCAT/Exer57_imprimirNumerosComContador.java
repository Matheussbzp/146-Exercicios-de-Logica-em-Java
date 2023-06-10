package FACCAT;

// 57) Reescreva o exercício 50 utilizando a estrutura REPITA e um CONTADOR.

public class Exer57_imprimirNumerosComContador {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.print(contador + " ");
            contador++;
        } while (contador <= 10);
        System.out.println();
    }
}
