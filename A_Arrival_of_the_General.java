import java.util.*;

/**
 * A_Arrival_of_the_General
 */
public class A_Arrival_of_the_General {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxvalue = 0;
        int minvalue = 1000;
        int maxindex = 0;
        int minindex = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x > maxvalue) {
                maxindex = i;
                maxvalue = x;
            }
            if (x <= minvalue) {
                minindex = i;
                minvalue = x;
            }
        }
        // cout<<maxindex<<" max"<<minindex<<"min\n";
        if (maxindex > minindex) {
            System.out.println((maxindex - 1) + (n - minindex) - 1);
        } else {
            System.out.println((maxindex - 1) + (n - minindex));

        }

    }
}