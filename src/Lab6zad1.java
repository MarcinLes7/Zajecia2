import java.util.StringTokenizer;

public class Lab6zad1 {
    public static void main(String[] args) {

        StringTokenizer str1;

        String data = "29/04/2016";
        str1 = new StringTokenizer(data, "/");
        System.out.println("dzień: " + str1.nextToken());
        System.out.println("miesiąc " + str1.nextToken());
        System.out.println("rok: " + str1.nextToken());



    }



}
