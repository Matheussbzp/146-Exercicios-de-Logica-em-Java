package MANZANO;

import java.util.Scanner;

/**
 * Exer04J_DivisaoInteira - Apresenta o resultado inteiro da divisão de dois números quaisquer. Para a
 * elaboração do programa, não é utilizado o operador aritmético DIV. A solução é alcançada com a
 * utilização de looping. Ou seja, o programa apresenta como resultado (quociente) quantas vezes o
 * divisor cabe no dividendo.
 */
public class Exer04J_DivisaoInteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();
        int quociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            quociente++;
        }
        System.out.println("O quociente da divisão é: " + quociente);
        scanner.close();
    }
}
