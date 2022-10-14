import java.util.*;

/**
 * A_Winner
 */
public class A_Winner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String s1 = "";
        while (t-- > 0) {
            String s = sc.next();

            int n = sc.nextInt();

            map.put(s, map.getOrDefault(s, 0) + n);
        }
        int max = 0;
        String str = "";
        for (String i : map.keySet()) {

            if (map.get(i) > max) {
                max = map.get(i);
                System.out.println(str);
                break;
            }
        }

    }
}