import java.util.*;

/**
 * B_Increasing
 */
public class B_Increasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            for (int i : a) {
                set.add(i);
            }
            if (set.size() == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}