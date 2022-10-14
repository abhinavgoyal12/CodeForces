import java.util.*;

/**
 * A_Game_With_Sticks
 */
public class A_Game_With_Sticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = Math.min(m, n);
        if (min % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }

    }
}
