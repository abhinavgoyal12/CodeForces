import java.util.*;

/**
 * A_Helpful_Maths
 */
public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() == 1) {
            System.out.println(s);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch)) {
                    list.add(ch - 48);
                }
            }
            Collections.sort(list);
            String str = "";
            for (int i = 0; i < list.size(); i++) {
                str += list.get(i) + "+";
            }
            System.out.println(str.substring(0, str.length() - 1));
        }
    }
}