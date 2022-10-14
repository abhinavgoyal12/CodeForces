import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();

            String str = sc.next();
            int c1 = 0, c2 = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '1') {
                    c1++;
                } else {
                    c2++;
                }
            }
            System.out.println(c1);
            System.out.println(c2);
        }
    }
}