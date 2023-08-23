package StackAndQueue;

import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='[' || ch == '{' || ch == '('){
                st.push(ch);
            }else if ( st.size()>0 && ch==')' && st.peek()=='('){
                st.pop();
            }else if ( st.size()>0 && ch==']' && st.peek()=='['){
                st.pop();
            }else if ( st.size()>0 && ch=='}' && st.peek()=='{'){
                st.pop();
            }else{
                return false;
            }
        }

        if(st.size()==0)return true ;

        return false; 
    }
}
