package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "gamer";

        String ans = reverse(str, str.length() - 1);

        System.out.println(ans);
    }

    public static String reverse(String str, int idx) {

        if (idx == -1) {
            return "";
        }

        char ch = str.charAt(idx);

        String rem = reverse(str, idx - 1);

        String ans = ch + rem;

        return ans;
    }
}
