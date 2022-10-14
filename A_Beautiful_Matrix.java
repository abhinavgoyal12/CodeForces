import java.util.*;

import javax.lang.model.util.ElementScanner6;

/**
 * A_Beautiful_Matrix
 */
public class A_Beautiful_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int m = 0, n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] == 1) {
                    m = i;
                    n = j;
                }
            }
        }
        int res = 0;
        if (m == 0 || m == 4) {
            if (n == 0 || n == 4) {
                res = 4;
            } else if (n == 1 || n == 3) {
                res = 3;
            }

            else {
                res = 2;
            }

        }
        if (m == 1 || m == 3) {
            if (n == 0 || n == 4) {
                res = 3;
            } else if (n == 1 || n == 3) {
                res = 2;
            } else {
                res = 1;
            }
        }
        if (m == 2) {
            if (n == 0 || n == 4) {
                res = 2;
            } else if (n == 1 || n == 3) {
                res = 1;
            } else if (n == 2) {
                res = 0;
            }
        }
        System.out.println(res);
    }
}