public class removeSpaces {
    public static void main(String[] args) {
        String str = "Hello in the world of Programming ";

        String ans = remove(str);

        System.out.println(ans);
    }


    public static String remove(String str){
        String ans = "";

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch!=' '){
                ans+=ch;
            }
        }

        return ans ;
    }
}
