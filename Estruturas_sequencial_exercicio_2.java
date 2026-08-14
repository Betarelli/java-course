import java.util.Locale;
import java.util.Scanner;

public class Estruturas_sequencial_exercicio_2 {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
         * valor da área deste círculo com quatro
         * casas decimais conforme exemplos.
         * Fórmula da área: area = π . raio2
         * Considere o valor de π = 3.14159
         */

        Scanner entrada = new Scanner(System.in);

        double raio;
        final double pi = 3.14159;

        System.out.println("Bem vindo ao calculador de área de círculo!");
        System.out.println("Por favor informe o valor do raio do círculo: ");

        while (!entrada.hasNextDouble()) {
            System.out.println("Por favor informe um valor válido!");
            entrada.next();
        }

        raio = entrada.nextDouble();
        entrada.close();

        double area = pi * Math.pow(raio, 2);
        Locale.setDefault(Locale.US);
        System.out.printf("O raio informado %.2f e a área do circulo é %.4f", raio, area);
    }
}
