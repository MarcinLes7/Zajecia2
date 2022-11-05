public class ConvTester {
    public static void main(String[] args) {

   /*     int firstPrice = 234;
        int secondPrice = 178;

        System.out.println(Math.max(firstPrice, secondPrice));*/

/*        byte a = 7;
        short b;
        int c;

        c = a; // konwersja niejawna
        b = c; // nie da się bo shorta chce dac inta
               // wówczas trzeba zrobić rzutowanie czyli jawną konwersję
        b = (short) b; // teraz sie da bo rzutowałem*/

        int a = 5;
        double b = 13.5;
        double c = b / a; // to działa bo konwersja niejawna
        // ale gdyby było tk
        //int d = b / a; //tak sie nie da
        int d = (int ) b / a; // tak się da bo rzutowanii






    }
}
