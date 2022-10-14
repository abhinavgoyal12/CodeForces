import java.util.*;

import javax.lang.model.util.ElementScanner6;

/**
 * A_Sum
 */
public class A_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b == c) {
                System.out.println("YES");
            } else if (b + c == a) {
                System.out.println("YES");
            } else if (c + a == b) {

                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}