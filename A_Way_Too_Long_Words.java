
/**
 * A_Way_Too_Long_Words
 */
import java.util.*;

public class A_Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        while (n-- >= 0) {
            String str = sc.nextLine();
            if (str.length() <= 10) {
                System.out.println(str);
            } else {
                int c = 0;
                for (int i = 1; i < str.length() - 1; i++) {
                    c++;
                }
                char first = str.charAt(0);
                char last = str.charAt(str.length() - 1);
                res = first + Integer.toString(c) + last;
                System.out.println(res);
            }

        }
        sc.close();
    }
}