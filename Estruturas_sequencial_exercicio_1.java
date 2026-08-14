import java.util.Scanner;

public class Estruturas_sequencial_exercicio_1 {
    public static void main(String[] args) {

        /*
         * Exercicio: Faça um programa para ler dois valores inteiros, e depois mostrar
         * na tela a soma desses números com uma
         * mensagem explicativa.
         */

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Bem vindo ao somador!");
        System.out.println("Por favor informe o primeiro número: ");
        while (!entrada.hasNextInt()) {
            System.out.println("Por favor informe um número válido!");
            entrada.next();
        }
        numero1 = entrada.nextInt();

        System.out.println("Por favor informe o segundo número: ");
        while (!entrada.hasNextInt()) {
            System.out.println("Por favor informe um número válido!");
            entrada.next();
        }
        numero2 = entrada.nextInt();

        entrada.close();

        System.out.println("Número 1 é " + numero1 + " e o número 2 é " + numero2);
        System.out.println("A soma dos números é " + (numero1 + numero2));

    }
}
