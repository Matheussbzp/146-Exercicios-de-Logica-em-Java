package FACCAT;

import java.util.Scanner;

/*
  Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10,
  caso contrário escrever NÃO É MAIOR QUE 10!
*/

public class Exer14_MaiorQue10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura do valor
        int valor;

        System.out.print("Digite um valor: ");
        valor = scanner.nextInt();

        // verificação se o valor é maior que 10
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        scanner.close();
    }
}
