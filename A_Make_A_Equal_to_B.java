import java.util.*;

/**
 * A_Make_A_Equal_to_B
 */
public class A_Make_A_Equal_to_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int cnt1 = 0, cnt2 = 0;
            int ok = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                cnt1 += a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                cnt2 += b[i];
            }
            if (Arrays.equals(a, b)) {
                System.out.println(0);
            } else if (cnt1 == cnt2) {
                System.out.println(1);
            } else {
                int k = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == 1 && b[i] == 1) {
                        k += 1;
                    }
                }
                if (k == cnt1 || k == cnt2) {
                    System.out.println(Math.abs(cnt1 - cnt2));
                } else {
                    System.out.println(Math.abs(cnt1 - cnt2) + 1);
                }
            }

            t--;
        }

    }
}