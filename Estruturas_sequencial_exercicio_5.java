import java.util.Scanner;

public class Estruturas_sequencial_exercicio_5 {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
         * valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago.
         */

        Scanner entrada = new Scanner(System.in);

        int id_p1, id_p2;
        int p1_und, p2_und;
        double valor_und_p1, valor_und_p2;
        double total;

        valor_und_p1 = 2.5;
        valor_und_p2 = 7.25;

        System.out.println("Por favor informe o ID do primeiro produto: ");
        while (!entrada.hasNextInt()) {
            System.out.println("Por favor digite um número válido");
            entrada.next();
        }
        id_p1 = entrada.nextInt();

        System.out.println("O Produto (" + id_p1 + ") custa: " + valor_und_p1);
        System.out.println("Informe a quatidade do produto (" + id_p1 + ")");

        while (!entrada.hasNextInt()) {
            System.out.println("Por favor digite um número válido");
            entrada.next();
        }
        p1_und = entrada.nextInt();

        System.out.println("Por favor informe o ID do segundo produto: ");
        while (!entrada.hasNextInt()) {
            System.out.println("Por favor digite um número válido");
            entrada.next();
        }
        id_p2 = entrada.nextInt();

        System.out.println("O Produto (" + id_p2 + ") custa: " + valor_und_p2);
        System.out.println("Informe a quatidade do produto (" + id_p2 + ")");

        while (!entrada.hasNextInt()) {
            System.out.println("Por favor digite um número válido");
            entrada.next();
        }
        p2_und = entrada.nextInt();

        entrada.close();

        total = p1_und * valor_und_p1 + p2_und * valor_und_p2;

        System.out.println("Primeiro Produto: (" + id_p1 + ") Quantidade: " + p1_und
                + " Valor total do Primeiro Produto: R$ " + (p1_und * valor_und_p1));
        System.out.println("Segundo Produto: (" + id_p2 + ") Quantidade: " + p2_und
                + " Valor total do Primeiro Produto: R$ " + (p2_und * valor_und_p2));
        System.out.println("Total a pagar: R$ " + total);
    }
}