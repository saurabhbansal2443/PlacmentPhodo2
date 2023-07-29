public class removeDuplicate {
    public static void main(String[] args) {
        String str = "abccacddddq";

        System.out.println(remove(str));
    }

    public static String remove(String str){
        
        if(str.length()==0 || str.length()==1){
            return str;
        }

        String ans = "";

        ans +=str.charAt(0);

        for(int i=1;i<str.length();i++){
            char pre = str.charAt(i-1);
            char curr = str.charAt(i);

            if(pre!=curr){
                ans+=curr;
            }
        }

        return ans;
    }
}
