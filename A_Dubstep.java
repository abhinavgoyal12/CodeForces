import java.util.*;

/**
 * A_Dubstep
 */
public class A_Dubstep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("WUB", " ");
        s.trim();
        s = s.replaceAll("( )+", " ");
        System.out.println(s);
    }
}