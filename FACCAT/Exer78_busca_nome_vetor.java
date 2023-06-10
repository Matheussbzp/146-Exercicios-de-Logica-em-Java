package FACCAT;

import java.util.Scanner;

// Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes lidos em um vetor. 
// Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI, 
// se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário.

public class Exer78_busca_nome_vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa #" + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite o nome a ser buscado: ");
        String nomeBusca = scanner.nextLine();

        boolean achei = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                achei = true;
                break;
            }
        }

        if (achei) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();
    }
}
