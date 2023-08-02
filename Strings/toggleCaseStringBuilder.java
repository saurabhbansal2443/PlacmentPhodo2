public class toggleCaseStringBuilder {
    public static void main(String[] args) {
        String str = "gdjHJHkjkHHkK";

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                ch = (char) (ch - 'a' + 'A');

            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }

            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
