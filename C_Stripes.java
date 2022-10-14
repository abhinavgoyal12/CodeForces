import java.util.*;

/**
 * C_Stripes
 */
public class C_Stripes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a[] = new String[8];
            for (int i = 0; i < 8; i++) {

                a[i] = sc.next();

            }
            char ch = 'B';

            for (int i = 0; i < 8; i++) {
                if (a[i].equals("RRRRRRRR")) {
                    ch = 'R';
                }
            }
            System.out.println(ch);
        }
    }
}