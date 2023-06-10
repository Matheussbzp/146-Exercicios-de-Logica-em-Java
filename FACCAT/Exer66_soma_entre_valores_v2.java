package FACCAT;

// Leia dois valores inteiros. A seguir, calcule a soma dos números entre eles e atribua o resultado a uma variável chamada soma. 
// Caso o segundo valor lido seja menor do que o primeiro, deve-se trocar os valores para que o cálculo seja feito corretamente. 
// Por fim, exiba o valor da variável soma.

import java.util.Scanner;

public class Exer66_soma_entre_valores_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int soma = 0;

        if (valor1 < valor2) {
            for (int i = valor1; i <= valor2; i++) {
                soma += i;
            }
        } else {
            for (int i = valor2; i <= valor1; i++) {
                soma += i;
            }
        }

        System.out.println("A soma dos valores entre " + valor1 + " e " + valor2 + " é: " + soma);

        scanner.close();
    }
}
