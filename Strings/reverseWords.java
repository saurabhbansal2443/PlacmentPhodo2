public class reverseWords {
    public static void main(String[] args) {
        String str = "Hello in the world of Data Structure";

        String ans = reverseSentence(str);

        System.out.println(ans);


    }


    public static String reverseSentence(String str){
        String[] arr = str.split(" ");

        String ans = "";

        for(int i=0;i<arr.length;i++){

            String temp = arr[i];

            String tempRev = reverse(temp);

            ans += tempRev + " ";

        }

        return ans ;
    }

    public static String reverse(String str){

        String ans = "";

        for(int i=str.length()-1;i>=0;i--){
            ans += str.charAt(i);
        }

        return ans ;
    }
}
