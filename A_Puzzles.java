import java.util.*;

/**
 * A_Puzzles
 */
public class A_Puzzles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - p + 1; i++) {
            min = Math.min(min, a[i + p - 1] - a[i]);
        }
        System.out.println(min);

    }
}