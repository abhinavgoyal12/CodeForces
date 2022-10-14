import java.util.*;

import javax.lang.model.util.ElementScanner6;

/**
 * A_Lucky_Division
 */
public class A_Lucky_Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 7 || n == 4) {
            System.out.println("YES");
            System.exit(0);
        }

        boolean boo = true;
        int k = n;
        while (k != 0) {
            int d = k % 10;
            k = k / 10;
            if (d == 7 || d == 4) {
                continue;
            } else {
                boo = false;
                // System.out.println("NO");
                break;
            }
        }
        // if (boo == true) {
        // System.out.println("YES");
        // }
        if (n % 7 == 0 || n % 4 == 0 || n % 47 == 0 || n % 74 == 0 || n % 744 == 0) {
            boo = true;
        }
        if (boo == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}