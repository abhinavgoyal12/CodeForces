import java.util.*;

public class A_Young_Physicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[][] = new int[t][3];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < t; i++) {
            sum1 += a[i][0];
            sum2 += a[i][1];
            sum3 += a[i][2];
        }
        if (sum1 == 0 && sum2 == 0 && sum3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}