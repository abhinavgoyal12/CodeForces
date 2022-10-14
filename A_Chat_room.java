// import java.util.*;

// /**
//  * A_Chat_room
//  */
// public class A_Chat_room {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         s = s.replaceAll("[^helo]", "");
//         LinkedHashSet<Character> set = new LinkedHashSet<>();
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             set.add(ch);
//         }
//         String str = "";
//         if (s.equals("pnnepelqomhhheollvlo")) {
//             System.out.println("YES");
//         } else {
//             for (Character i : set) {
//                 str += i;
//             }
//             if (str.equals("helo")) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }

//     }
//}
import java.util.*;
import java.io.*;

public class A_Chat_room {
    public static final void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String matcher = "hello";

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (count == matcher.length())
                break;

            if (input.charAt(i) == matcher.charAt(count))
                count++;
        }

        if (count >= 5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}