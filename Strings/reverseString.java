public class reverseString{
    public static void main(String[] args) {
        String str = "RadaRString ";

        String ans = reverse(str);

        System.out.println(ans);
    }

    public static String reverse(String str){

        String ans = "";

        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);      
          }

          return ans ;
    }
}