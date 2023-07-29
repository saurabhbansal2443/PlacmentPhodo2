public class compressString {
    public static void main(String[] args) {
        String str = "aaabbbbcccccdfgthdjwhjkkkkkk";

        System.out.println(compress(str));
    }

    public static String compress(String str) {

        String ans = "" + str.charAt(0);

        int count = 1;
        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);

            if (curr != pre) {

                if (count > 1) {
                    ans += count;
                }

                ans += curr;
                count = 1;
            } else {
                count++;
            }
        }

        if (count > 1) {
            ans += count;
        }

        return ans ;

    }
}
