package FACCAT;

// 64) Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior a 40 devem 
// ser somados. Escreva o valor final da soma efetuada.

import java.util.Scanner;

public class Exer64_somaNumerosInferiores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int numero = scanner.nextInt();
            if (numero < 40) {
                soma += numero;
            }
        }

        System.out.printf("A soma dos números inferiores a 40 é %d.\n", soma);

        scanner.close();
    }
}
