package MANZANO;

/**
 * Exer05J_ConversaoCelsiusFahrenheit - Apresenta os valores de conversão de graus Celsius em
 * Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus
 * Celsius.
 */
public class Exer05J_ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (9.0 / 5.0 * celsius) + 32.0;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        }
    }
}
