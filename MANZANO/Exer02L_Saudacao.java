package MANZANO;

import java.util.Scanner;

/**
 * Exer02L_Saudacao - Lê o nome e o sexo de uma pessoa e apresenta uma mensagem
 * de saudação de acordo
 * com o sexo informado.
 */
public class Exer02L_Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu sexo (M/F): ");
        String sexo = scanner.nextLine();
        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Ilma Sra. " + nome);
        } else {
            System.out.println("Sexo inválido.");
        }
        scanner.close();
    }
}