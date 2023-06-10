package FACCAT;

// 52) Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.

public class Exer52_imprimirNumerosMaioresQue100 {
    public static void main(String[] args) {
        int numero = 101;
        for (int i = 1; i <= 10; i++) {
            System.out.print(numero + " ");
            numero++;
        }
        System.out.println();
    }
}
