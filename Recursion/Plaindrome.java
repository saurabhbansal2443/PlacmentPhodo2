package Recursion;

public class Plaindrome {
    public static void main(String[] args) {
        String str = "radtr";

        System.out.println(check(str, 0, str.length()-1));
    }


    public static boolean check(String str , int start , int end){

        if(start>=end){
            return true ;
        }

        if(str.charAt(start)!=str.charAt(end)){
                return false;
        }

        boolean ans = check(str,start+1,end-1);

        return ans ;
    }
}
