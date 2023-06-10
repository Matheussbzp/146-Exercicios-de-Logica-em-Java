package FACCAT;

// 42) Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para 
// estar em condições, um dos seguintes requisitos deve ser satisfeito: 
// - Ter no mínimo 65 anos de idade. 
// - Ter trabalhado no mínimo 30 anos. 
// - Ter no mínimo 60 anos  e  ter trabalhado no mínimo 25 anos. 
// Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano 
// de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo 
// de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.

import java.util.Scanner;

public class Exer42_verificarAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura dos dados do empregado
        System.out.print("Digite o número do empregado: ");
        scanner.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso do empregado na empresa: ");
        int anoIngresso = scanner.nextInt();

        // cálculo da idade e do tempo de trabalho
        int idade = 2021 - anoNascimento;
        int tempoTrabalho = 2021 - anoIngresso;

        // verificação da condição de aposentadoria
        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        // impressão da idade e do tempo de trabalho
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Tempo de trabalho: %d anos\n", tempoTrabalho);

        scanner.close();
    }
}
