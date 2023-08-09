package Recursion;

import java.util.ArrayList;

public class getSubsequence {
    public static void main(String[] args) {
        String str = "abc";

        System.out.println(get(str));

    }

    public static ArrayList<String> get(String str) {
        ArrayList<String> ans = new ArrayList<>();
        
        if (str.length() == 0) {
            ans.add("");
            return ans;
        }

        char ch = str.charAt(0);
        String rem = str.substring(1);

        ArrayList<String> rres = get(rem);

        for (String s : rres) {

            ans.add(s);
            ans.add(ch + s);
        }

        return ans;
    }
}
