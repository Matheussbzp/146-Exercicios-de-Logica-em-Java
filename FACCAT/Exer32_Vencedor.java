package FACCAT;

import java.util.Scanner;

/*
  Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
  do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
*/

public class Exer32_Vencedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura dos nomes dos times e dos gols marcados
        String timeA, timeB;
        int golsA, golsB;

        System.out.print("Digite o nome do time A: ");
        timeA = scanner.nextLine();

        System.out.print("Digite o número de gols do time A: ");
        golsA = scanner.nextInt();

        System.out.print("Digite o nome do time B: ");
        scanner.nextLine(); // consumir a quebra de linha após o número de gols do time A
        timeB = scanner.nextLine();

        System.out.print("Digite o número de gols do time B: ");
        golsB = scanner.nextInt();

        // verificação do vencedor ou empate
        if (golsA > golsB) {
            System.out.printf("Vencedor: %s\n", timeA);
        } else if (golsB > golsA) {
            System.out.printf("Vencedor: %s\n", timeB);
        } else {
            System.out.println("EMPATE");
        }

        scanner.close();
    }
}
