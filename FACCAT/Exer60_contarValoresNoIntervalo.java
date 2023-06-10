package FACCAT;

// 60) Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20] (inlcuindo os 
// valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.

import java.util.Scanner;

public class Exer60_contarValoresNoIntervalo {
    public static void contarValoresNoIntervalo() {
        Scanner scanner = new Scanner(System.in);

        int contIntervalo = 0;
        int contFora = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            int valor = scanner.nextInt();
            if (valor >= 10 && valor <= 20) {
                contIntervalo++;
            } else {
                contFora++;
            }
        }

        System.out.printf("%d valores estão no intervalo [10,20] e %d estão fora do intervalo.\n", contIntervalo, contFora);

        scanner.close();
    }
}
