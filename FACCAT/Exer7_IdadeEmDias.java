package FACCAT;

import java.util.Scanner;

public class Exer7_IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anos, meses, dias, idadeEmDias;

        System.out.print("Digite a idade da pessoa em anos: ");
        anos = scanner.nextInt();

        System.out.print("Digite a idade da pessoa em meses: ");
        meses = scanner.nextInt();

        System.out.print("Digite a idade da pessoa em dias: ");
        dias = scanner.nextInt();

        idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("A idade da pessoa em dias é " + idadeEmDias);

        scanner.close();
    }
}

//7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.