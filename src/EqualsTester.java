public class EqualsTester {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Ale to się rozrasta.";
        str2 = str1;

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));

        // ale

        System.out.println("-------");

        str2 = new String(str1);
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));

        // jak srawdzić czy to jest ten sam napis
        System.out.println("Ta sama wartość? " + (str1.equals(str2)));


    }
}
