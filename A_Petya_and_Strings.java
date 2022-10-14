import java.util.*;

import javax.lang.model.util.ElementScanner6;

import org.w3c.dom.css.ElementCSSInlineStyle;

/**
 * A_Petya_and_Strings
 */
public class A_Petya_and_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.compareTo(str2) == 0) {
            System.out.println(0);
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }
    }
}