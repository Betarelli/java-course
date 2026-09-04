import java.util.Scanner;

public class Estrutura_condicional_exercício_8 {
    public static void main(String[] args) {
        /*
         * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
         * pagar seus impostos, pois sabem
         * que nele não existem políticos corruptos e os recursos arrecadados são
         * utilizados em benefício da população, sem
         * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
         * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
         * de Lisarb. Em seguida, calcule e
         * mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a
         * tabela abaixo.
         * 
         * 
         * 
         * De 0 até 2000.00: isento
         * De 2000.01 até 3000.00: 8% de imposto
         * De 3000.01 até 8000.00: 18% de imposto
         * Acima de 8000.00: 25% de imposto
         * 
         * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
         * sobre R$ 1000.00, pois a faixa de
         * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No
         * exemplo fornecido (abaixo), a taxa é
         * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no
         * total. O valor deve ser impresso com
         * duas casas decimais.
         * 
         */

        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Digite o valor do salário: ");
        salario = entrada.nextDouble();

        entrada.close();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            System.out.println("8% de imposto");
        } else if (salario <= 8000.00) {
            System.out.println("18% de imposto");
        } else {
            System.out.println("25% de imposto");
        }

        if (salario >= 0 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario >= 2000.00 && salario <= 3000.00) {
            System.out.println("8% de imposto");
        } else if (salario >= 3000.00 && salario <= 8000.00) {
            System.out.println("18% de imposto");
        } else {
            System.out.println("25% de imposto");
        }

    }
}
