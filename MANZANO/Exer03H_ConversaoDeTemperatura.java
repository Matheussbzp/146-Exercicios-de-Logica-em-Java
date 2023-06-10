package MANZANO;

/**
 * Exer03H_ConversaoDeTemperatura - Apresenta os valores de conversão de graus Celsius em
 * Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus
 * Celsius. O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é
 * F = 9/5 * C + 32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */
public class Exer03H_ConversaoDeTemperatura {
    public static void main(String[] args) {
        int celsius = 10;
        while (celsius <= 100) {
            double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
            celsius += 10;
        }
    }
}
