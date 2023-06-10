package FACCAT;

// Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).

public class Exer67_media_entre_valores {
    public static void main(String[] args) {
        int valor1 = 15;
        int valor2 = 100;

        int soma = 0;
        int quantidade = 0;

        for (int i = valor1; i <= valor2; i++) {
            soma += i;
            quantidade++;
        }

        double media = soma / quantidade;

        System.out.println("A média dos valores entre " + valor1 + " e " + valor2 + " é: " + media);
    }
}
