package FACCAT;

import java.util.Scanner;

/**
 * Exer84 - Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores).
 * Após, ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um terceiro
 * vetor Soma a soma dos elementos do vetor A com os do vetor B (respeitando as mesmas posições)
 * e escrever o vetor Soma.
 */
public class Exer84_Somar_Vetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int N = scanner.nextInt();

        double[] A = new double[N];
        double[] B = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor da posição " + i + " do vetor A: ");
            A[i] = scanner.nextDouble();
            System.out.print("Digite o valor da posição " + i + " do vetor B: ");
            B[i] = scanner.nextDouble();
        }

        double[] Soma = new double[N];

        for (int i = 0; i < N; i++) {
            Soma[i] = A[i] + B[i];
        }

        System.out.println("Vetor Soma:");
        for (int i = 0; i < N; i++) {
            System.out.println(Soma[i]);
        }

        scanner.close();
    }
}
