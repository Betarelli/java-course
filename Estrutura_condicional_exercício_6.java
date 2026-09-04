import java.util.Scanner;

public class Estrutura_condicional_exercício_6 {
    public static void main(String[] args) {
        /*
         * Você deve fazer um programa que leia um valor qualquer e apresente uma
         * mensagem dizendo em qual dos
         * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se
         * encontra. Obviamente se o valor não estiver em
         * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
         */

        Scanner entrada = new Scanner(System.in);

        double valor;

        System.out.println("Digite um valor: ");
        valor = entrada.nextDouble();

        entrada.close();

        if (valor < 0 || valor > 100) {
            System.out.println("Fora do intervalo");
        } else if (valor >= 0 && valor <= 25) {
            System.out.println("Está entre o intervalo [0,25]");
        } else if (valor >= 25 && valor <= 50) {
            System.out.println("Está entre o intervalo [25,50]");
        } else if (valor >= 50 && valor <= 75) {
            System.out.println("Está entre o intervalo [50,75]");
        } else if (valor >= 75 && valor <= 100) {
            System.out.println("Está entre o intervalo [50,75]");
        }

    }
}
