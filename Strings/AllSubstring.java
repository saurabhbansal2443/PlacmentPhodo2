public class AllSubstring {
    public static void main(String[] args) {
        String str = "cattac";

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
               String s = str.substring(i,j);

               boolean ans = checker2(s);

               if(ans == true){
                System.out.println(s);
               }
            }
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
