package MANZANO;

/**
 * Exer04C_NumerosDivisiveisPor4 - Apresenta todos os números divisíveis por 4 que sejam menores que
 * 200. Para verificar se o número é divisível por 4, efetua dentro da malha a verificação lógica
 * desta condição com a instrução if, perguntando se o número é divisível; sendo, mostre-o; não sendo,
 * passe para o próximo passo. A variável que controlará o contador é iniciada com o valor 1.
 */
public class Exer04C_NumerosDivisiveisPor4 {
    public static void main(String[] args) {
        int numero = 1;
        while (numero < 200) {
            if (numero % 4 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
