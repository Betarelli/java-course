import java.util.Locale;
import java.util.Scanner;

public class Estruturas_sequencial_exercicio_4 {
    public static void main(String[] args) {
        /*
         * Fazer um programa que leia o número de um funcionário, seu número de horas
         * trabalhadas, o valor que recebe por
         * hora e calcula o salário desse funcionário. A seguir, mostre o número e o
         * salário do funcionário, com duas casas
         * decimais.
         */

        Scanner entrada = new Scanner(System.in);

        int id_funcionario;
        int horas_trabalhadas;
        double valor_hora;
        double salario;

        System.out.println("Bem vindo ao calculador de sálario de seus fúncionarios");
        System.out.println("Por favor informe o ID de seu funcionário: ");

        while (!entrada.hasNextInt()) {
            System.out.println("Por favor informe um número válido");
            entrada.next();
        }
        id_funcionario = entrada.nextInt();

        System.out.println("Por favor informe as horas trabalhadas do fúncionario: " + id_funcionario);
        while (!entrada.hasNextInt()) {
            System.out.println("Por favor informe um número válido");
            entrada.next();
        }
        horas_trabalhadas = entrada.nextInt();

        System.out.println("Por último informe o valor que o fúncionario: " + id_funcionario + " recebe");
        while (!entrada.hasNextDouble()) {
            System.out.println("Por favor informe um número válido");
            entrada.next();
        }
        valor_hora = entrada.nextDouble();

        entrada.close();

        salario = horas_trabalhadas * valor_hora;

        Locale.setDefault(Locale.US);

        System.out.println("Funcionário ID: " + id_funcionario);
        System.out.println("Salário: US$ " + salario);
    }
}
