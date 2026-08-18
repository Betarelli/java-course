import java.util.Scanner;

public class Estrutura_condicional_exercício_1 {

    public static void main(String[] args) {

        /*
         * Fazer um programa para ler um número inteiro, e depois dizer se este número é
         * negativo ou não.
         */

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        if (numero < -0) {
            System.out.println("Seu número é NEGATIVO");
        } else {
            System.out.println("Seu numero é POSITIVO!");
        }

        entrada.close();
    }
}