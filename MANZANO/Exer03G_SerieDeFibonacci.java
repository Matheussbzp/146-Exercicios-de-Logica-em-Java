package MANZANO;

/**
 * Exer03G_SerieDeFibonacci - Apresenta a série de Fibonacci até o décimo quinto
 * termo.
 */
public class Exer03G_SerieDeFibonacci {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 1;
        int contador = 1;
        System.out.println(numero1);
        System.out.println(numero2);
        while (contador <= 13) {
            int proximoNumero = numero1 + numero2;
            System.out.println(proximoNumero);
            numero1 = numero2;
            numero2 = proximoNumero;
            contador++;
        }
    }
}
