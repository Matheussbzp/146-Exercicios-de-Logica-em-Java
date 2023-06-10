package MANZANO;

/**
 * Exer04D_SomatorioDeGraosDeTrigo - Efetua o cálculo e no final apresenta o somatório do número de
 * grãos de trigo que se pode obter num tabuleiro de xadrez, obedecendo à seguinte regra: colocar um
 * grão de trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no
 * primeiro quadro coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3
 * grãos), no terceiro quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-
 * se 8 grãos (tendo-se então 15 grãos) até atingir o sexagésimo quarto (64o) quadro. Utilize
 * variáveis do tipo real como acumuladores.
 */
public class Exer04D_SomatorioDeGraosDeTrigo {
    public static void main(String[] args) {
        int quadro = 1;
        double graos = 1.0;
        double somatorio = 1.0;
        while (quadro < 64) {
            graos *= 2.0;
            somatorio += graos;
            quadro++;
        }
        System.out.println("O somatório de grãos de trigo é: " + somatorio);
    }
}
