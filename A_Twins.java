import java.util.*;

/**
 * A_Twins
 */
public class A_Twins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sum = sum / 2;
        if (a.length == 1) {
            System.out.println(1);
        } else {
            Arrays.sort(a);
            int cnt = 0;
            int ans = 0;
            for (int i = n - 1; i >= 0; i--) {
                ans += a[i];
                cnt++;
                if (ans > sum)
                    break;
            }
            System.out.println(cnt);
        }

    }
}