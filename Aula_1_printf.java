import java.util.Locale;

public class Aula_1_printf {
    public static void main(String[] args) {

        /*
         * %f: Representa números de ponto flutuante (decimais).
         * %d: Representa números inteiros.
         * %s: Representa cadeias de texto (strings).
         * \n: Cria uma nova linha no texto.
         */

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");

        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %c\n\n", age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);

    }
}
