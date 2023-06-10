package FACCAT;

import java.util.Scanner;

/*
  Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
  ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a
  soma dos outros 2 lados.
*/

public class Exer31_Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura das medidas dos lados
        double ladoA, ladoB, ladoC;

        System.out.print("Digite a medida do lado A: ");
        ladoA = scanner.nextDouble();

        System.out.print("Digite a medida do lado B: ");
        ladoB = scanner.nextDouble();

        System.out.print("Digite a medida do lado C: ");
        ladoC = scanner.nextDouble();

        // verificação se forma um triângulo
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.println("Forma um triângulo");
        } else {
            System.out.println("Não forma um triângulo");
        }

        scanner.close();
    }
}
