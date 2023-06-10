package FACCAT;

import java.util.Scanner;

/*
  A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
  de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
  Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
  o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
  (considere que o mês possua 4 semanas exatas).
*/

public class Exer22_SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura das horas trabalhadas e do salário por hora
        int horasTrabalhadas;
        double salarioHora, salarioTotal;

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        salarioHora = scanner.nextDouble();

        // cálculo do salário total
        if (horasTrabalhadas <= 160) {
            salarioTotal = horasTrabalhadas * salarioHora;
        } else {
            int horasExtras = horasTrabalhadas - 160;
            salarioTotal = (160 * salarioHora) + (horasExtras * salarioHora * 1.5);
        }

        // impressão do salário total
        System.out.printf("O salário total do funcionário é R$ %.2f", salarioTotal);

        scanner.close();
    }
}
