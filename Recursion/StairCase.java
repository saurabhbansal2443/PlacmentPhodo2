package Recursion;

import java.util.ArrayList;

public class StairCase {
    public static void main(String[] args) {
        int n = 5;

        ArrayList<String> ans = print(n);

        System.out.println(ans);
    }

    public static ArrayList<String> print(int n) {
        ArrayList<String> ans = new ArrayList<>();

        if (n == 0) {
            ans.add("");
            return ans;
        } else if (n < 0) {
            return ans;
        }

        ArrayList<String> step1 = print(n - 1);
        ArrayList<String> step2 = print(n - 2);
        ArrayList<String> step3 = print(n - 3);

        for(String s :step1){
            ans.add("1" + s);
        }
         for(String s :step2){
            ans.add("2" + s);
        }
         for(String s :step3){
            ans.add("3" + s);
        }
        return ans ;

    }
}
