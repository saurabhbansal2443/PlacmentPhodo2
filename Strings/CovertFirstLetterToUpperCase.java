public class CovertFirstLetterToUpperCase {
    public static void main(String[] args) {
        String str = "hello in the world of Java";

        String ans = convert(str);

        System.out.println(ans);
    }

    public static String convert(String str) {

        if (str.length() == 0) {
            return "";
        }
        String ans = "";
        char fc = str.charAt(0);
        if (fc >= 'a' && fc <= 'z') {
            fc = (char) (fc - 'a' + 'A');
        }
        ans += fc;
        int curr = 0;
        int nbr = 1;

        while (nbr < str.length()) {

            char c = str.charAt(curr);
            char n = str.charAt(nbr);

            if (c == ' ' && n >= 'a' && n <= 'z') {

                n = (char) (n - 'a' + 'A');

            }

            ans += n;

            curr++;
            nbr++;
        }
        return ans;
    }
}
