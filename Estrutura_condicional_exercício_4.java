import java.util.Scanner;

public class Estrutura_condicional_exercício_4 {
    public static void main(String[] args) {
        /*
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
         * jogo, sabendo que o mesmo pode
         * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
         * máxima de 24 horas.
         */

        Scanner entrada = new Scanner(System.in);

        int hr_inicial = entrada.nextInt();
        int hr_final = entrada.nextInt();

        entrada.close();

        int duracao;

        if (hr_inicial < hr_final) {
            duracao = hr_final - hr_inicial;
        } else {
            duracao = 24 - hr_inicial + hr_final;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
