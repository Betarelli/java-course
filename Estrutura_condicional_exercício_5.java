import java.util.Scanner;

public class Estrutura_condicional_exercício_5 {
    public static void main(String[] args) {
        /*
         * Com base na tabela abaixo, escreva um programa que leia o código de um item e
         * a quantidade deste item. A
         * seguir, calcule e mostre o valor da conta a pagar.
         * 
         * 1 Cachorro quente 4,00
         * 2 X - Salada 4,50
         * 3 X - Bacon 5,00
         * 4 Torrada Simples 2,00
         * 5 Refrigerante 1.50
         */

        Scanner entrada = new Scanner(System.in);

        int escolha, quantidade;

        double valor;

        System.out.println("Bem vindo a lojinha! Temos: ");
        System.out.println(
                "1 - Cachorro Quente  R$ 4,00\n2 - X-Salada R$ 4,50\n3 - X-Bacon R$ 5,00\n4 - Torrada Simples R$ 2,00\n5 - Refrigerante R$ 1,50\n");

        System.out.println("Digite o número para decidir a opção do menu que deseja: ");
        escolha = entrada.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a quantidade que deseja");
            quantidade = entrada.nextInt();
            valor = quantidade * 4.00;
            System.out.println("Valor total a pagar: " + valor);
        } else if (escolha == 2) {
            System.out.println("Digite a quantidade que deseja");
            quantidade = entrada.nextInt();
            valor = quantidade * 4.50;
            System.out.println("Valor total a pagar: " + valor);
        } else if (escolha == 3) {
            System.out.println("Digite a quantidade que deseja");
            quantidade = entrada.nextInt();
            valor = quantidade * 5.00;
            System.out.println("Valor total a pagar: " + valor);
        } else if (escolha == 4) {
            System.out.println("Digite a quantidade que deseja");
            quantidade = entrada.nextInt();
            valor = quantidade * 2.00;
            System.out.println("Valor total a pagar: " + valor);
        } else if (escolha == 5) {
            System.out.println("Digite a quantidade que deseja");
            quantidade = entrada.nextInt();
            valor = quantidade * 1.50;
            System.out.println("Valor total a pagar: R$" + valor);
        } else {
            System.out.println("O numéro que solicitou não está no cardápio");

        }
        entrada.close();
    }
}
