import java.util.Scanner;

public class Estrutura_condicional_exercício_3 {
    public static void main(String[] args) {
        /*
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
         * "Sao Multiplos" ou "Nao sao
         * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
         * números devem poder ser digitados em
         * ordem crescente ou decrescente.
         */

        Scanner entrada = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite um número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();

        if (n1 > n2) {
            if (n1 % n2 == 0) {
                System.out.println("SÃO multiplos");
            } else {
                System.out.println("NÃO são multiplos");
            }
        } else {
            if (n2 % n1 == 0) {
                System.out.println("SÃO multiplos");
            } else {
                System.out.println("NÃO são multiplos");
            }
        }

        entrada.close();
    }
}
