package FACCAT;

import java.util.Scanner;

// A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. 
// Faça um algoritmo para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever: 
// a) Média de salário da população 
// b) Média do número de filhos 
// c) Maior salário dos habitantes 
// d) Percentual de pessoas com salário menor que R$ 150,00 
// Obs.: O final da leituras dos dados se dará com a entrada de um “salário negativo”.

public class Exer73_pesquisa_habitantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaSalarios = 0;
        int quantidadeHabitantes = 0;
        double maiorSalario = Double.MIN_VALUE;
        int quantidadeSalariosMenores150 = 0;
        int somaFilhos = 0;

        while (true) {
            System.out.print("Digite o salário do habitante (ou um valor negativo para encerrar): R$ ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Digite o número de filhos do habitante: ");
            int filhos = scanner.nextInt();

            somaSalarios += salario;
            quantidadeHabitantes++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario < 150) {
                quantidadeSalariosMenores150++;
            }

            somaFilhos += filhos;
        }

        double mediaSalarios = somaSalarios / quantidadeHabitantes;
        double mediaFilhos = somaFilhos / (double)quantidadeHabitantes;
        double percentualSalariosMenores150 = (quantidadeSalariosMenores150 / (double)quantidadeHabitantes) * 100;

        System.out.println("Média de salário da população: R$ " + mediaSalarios);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário dos habitantes: R$ " + maiorSalario);
        System.out.println("Percentual de pessoas com salário menor que R$ 150,00: " + percentualSalariosMenores150 + "%");

        scanner.close();
    }
}
