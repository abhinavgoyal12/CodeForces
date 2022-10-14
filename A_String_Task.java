import java.util.*;

/**
 * A_String_Task
 */
public class A_String_Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                str += Character.toLowerCase(ch);
            } else {
                str += ch;
            }
        }
        str = str.replaceAll("[aeiouy]", "");
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str1 += "." + ch;
        }
        System.out.println(str1);
        // .substring(0, str1.length() - 1)

    }
}