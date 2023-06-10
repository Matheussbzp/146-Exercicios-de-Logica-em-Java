package MANZANO;

import java.util.Scanner;

/**
 * Exer03F_PotenciaDeBaseQualquer - Apresenta como resultado o valor de uma potência de uma base
 * qualquer elevada a um expoente qualquer, ou seja, de B^E, em que B é o valor da base e E o valor
 * do expoente. 
 * 
 * Observação: neste exercício não pode ser utilizado o operador de exponenciação (^).
 */
public class Exer03F_PotenciaDeBaseQualquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o valor do expoente: ");
        int expoente = scanner.nextInt();
        int resultado = 1;
        int contador = 1;
        while (contador <= expoente) {
            resultado *= base;
            contador++;
        }
        System.out.println(base + "^" + expoente + " = " + resultado);
        scanner.close();
    }
}
