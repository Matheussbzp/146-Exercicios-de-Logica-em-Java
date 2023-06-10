package FACCAT;

import java.util.Scanner;

/*
  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
  minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
  de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
*/

public class Exer21_DuracaoJogoXadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura da hora de início e da hora de fim
        int horaInicio, horaFim, duracao;

        System.out.print("Digite a hora de início: ");
        horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim: ");
        horaFim = scanner.nextInt();

        // cálculo da duração do jogo
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        // impressão da duração do jogo
        System.out.printf("A duração do jogo foi de %d horas", duracao);

        scanner.close();
    }
}
