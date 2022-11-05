public class Loops {
    public static void main(String[] args) {
       /* int x = 5;
        { // początek bloku
            int y= 10;
            y = x + y;
            System.out.println(y);

        } // koniec bloku
        // System.out.println(y); // y nie jest dostępny*/

       /* int x = 2;
        if (x > 2) {
            System.out.println("Jest większe od 2");
        } else if (x < 2){
            System.out.println("Jest mniejsze od 2");
        } else {
            System.out.println("Jest równe 2");
        }
*/

        // Instrukcja warunkowa switch
        // działa na takich typach; byte i Byte
        // short i Short
        // int i Integer
        // char i Character
        // enum
        // String
        // Instrukcja wystawiająca uczniowi odpowiedni opis oceny

        char grade = 'A';
        switch (grade) { // grade jest typu char i nie musimy pisać typu
            case 'A':
                System.out.println("Wspaniale");
                break; // zawsze musi być break

            case 'B':
                System.out.println("Dobrze");
                break;

            case 'D':
                System.out.println("Mogło być lepiej");
                break;

            default:
                System.out.println("Rozważ oszukiwanie");
        }

        // zadanie domowe - zrobic to samo na konstrukcjach if






    }
}
