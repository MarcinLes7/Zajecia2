import java.util.Locale;

public class TextFormat {
    public static void main(String[] args) {
        int accountBalance = 15005; // chcemy to ładnie wyswietlic
        System.out.println(accountBalance); // tu sie nieładnie wyswietli
        System.out.printf("Saldo: %,d zł%n",accountBalance); // ładnie formatuje

        // schemat opisu szablonu
        // %[flags][width][.precision]conversion - character
        // s - strings
        // d - decimal integers
        // f - floating points numbers
        // t - date time values
        // n - znak separacji linii
        // bB - booLeans

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.11f%n",pi);
        System.out.printf(new Locale("us"), "%.5f%n",pi);

        // Porównywanie = equals tester








    }
}
