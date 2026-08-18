import java.util.Scanner;

public class Estrutura_condicional_exercício_2 {
    public static void main(String[] args) {

        /*
         * Fazer um programa para ler um número inteiro e dizer se este número é par ou
         * ímpar.
         */

        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Digite um número:");
        n = entrada.nextInt();

        if (n % 2 == 0) {
            System.out.println("Seu número é PAR");
        } else {
            System.out.println("Seu número é IMPAR");
        }

        entrada.close();
    }
}
