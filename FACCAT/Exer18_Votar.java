package FACCAT;

import java.util.Scanner;

/*
  Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
  poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
*/

public class Exer18_Votar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do ano atual e do ano de nascimento
        int anoAtual, anoNascimento, idade;

        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = scanner.nextInt();

        // cálculo da idade
        idade = anoAtual - anoNascimento;

        // verificação se a pessoa pode votar
        if (idade >= 16) {
            System.out.println("A pessoa pode votar este ano!");
        } else {
            System.out.println("A pessoa não pode votar este ano!");
        }

        scanner.close();
    }
}
