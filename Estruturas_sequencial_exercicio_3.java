import java.util.Scanner;

public class Estruturas_sequencial_exercicio_3 {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
         * calcule e mostre a diferença do produto
         * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
         * D).
         */

        Scanner entrada = new Scanner(System.in);

        int A, B, C, D;
        int diferenca;

        System.out.println("Bem vindo ao calculador de diferenças com quatro números inteiros!");
        System.out.println("Por favor informe o valor de A: ");

        while (!entrada.hasNextInt()) {
            System.out.println("Por favor informe um número inteiro!");
            entrada.next();
        }
        A = entrada.nextInt();

        System.out.println("Por favor informe o valor de B: ");

        while (!entrada.hasNextInt()) {
            System.out.println("Por favor informe um número inteiro!");
            entrada.next();
        }
        B = entrada.nextInt();

        System.out.println("Por favor informe o valor de C: ");

        while (!entrada.hasNextInt()) {
            System.out.println("Por favor informe um número inteiro!");
            entrada.next();
        }
        C = entrada.nextInt();

        System.out.println("Por favor informe o valor de D: ");

        while (!entrada.hasNextInt()) {
            System.out.println("Por favor informe um número inteiro!");
            entrada.next();
        }
        D = entrada.nextInt();

        entrada.close();

        diferenca = (A * B) - (C * D);

        System.out.println("A diferença de A e B pelo C e D é " + diferenca);

    }
}
