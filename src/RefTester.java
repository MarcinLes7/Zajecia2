import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        String str1 = "Jakiś tekst";
        // sprawdzić co to jest za typ
        /*System.out.println(str1.getClass().getName());
        System.out.println(str1.getClass().getSimpleName());
        */

        /*System.out.println("Teksas" instanceof String); // tak jest
        System.out.println("Teksas" instanceof Object); // true bo dziedziczy po object
        */

        /*Object obj = new Object();
        System.out.println(obj instanceof Object); // tak
*/

        Point pt1, pt2;
        pt1 = new Point(100, 100);
        pt2 = pt1; // mamy tylko jeden objekt, mamy dwie referencje do tego samgo objektu

        pt1.x = 200;
        pt1.y = 200;
        System.out.println(pt1);
        System.out.println(pt2);








    }
}
