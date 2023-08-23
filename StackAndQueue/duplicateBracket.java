package StackAndQueue;
import java.util.*;

public class duplicateBracket {
    public static void main(String[] args) {
        String str1 = "(a+b+(c-d))";
        String str2 = "(a+b+((c-d)))";

        System.out.println(check(str1));
    }

    public static boolean check(String str){

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch!=')'){
                st.push(ch);
            }else if(st.peek()=='('){
                return false;
            }else{

                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }
        }
        return true ;
        
    }
}
