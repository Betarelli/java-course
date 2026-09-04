import java.util.Scanner;

public class Estrutura_condicional_exercício_7 {
    public static void main(String[] args) {
        /*
         * Leia 2 valores com uma casa decimal (x e y), que devem representar as
         * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
         * qual
         * pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x =
         * y = 0).
         * Se o ponto estiver na origem, escreva a mensagem “Origem”.
         * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme
         * for a situação.
         */

        Scanner entrada = new Scanner(System.in);

        double valorX, valorY;

        System.out.println("Digite o valor de X: ");
        valorX = entrada.nextDouble();

        System.out.println("Digite o valor de Y: ");
        valorY = entrada.nextDouble();

        if (valorX > 0 && valorY > 0) {
            System.out.println("Primeiro quadrante");
        } else if (valorX < 0 && valorY > 0) {
            System.out.println("Segundo quadrante");
        } else if (valorX < 0 && valorY < 0) {
            System.out.println("Terceiro quadrante");
        } else if (valorX > 0 && valorY < 0) {
            System.out.println("Quarto quadrante");
        } else if (valorX == 0 && valorY == 0) {
            System.out.println("Origem");
        } else if (valorX == 0) {
            System.out.println("Eixo Y");
        } else if (valorY == 0) {
            System.out.println("Eixo X");
        }

        entrada.close();
    }

}
