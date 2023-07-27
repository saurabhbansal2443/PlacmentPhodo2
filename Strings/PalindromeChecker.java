public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "radpr";

        boolean ans = checker2(str);

        System.out.println(ans);

    }

    public static boolean checker1(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }

        if (str.equals(ans) == true) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean checker2(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
