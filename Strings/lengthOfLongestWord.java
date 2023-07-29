import java.util.Arrays;

public class lengthOfLongestWord {

    public static void main(String[] args) {
        String str = "Hello in the world of javaaaaaa";

        int ans = finder2(str);

        System.out.println(ans);
      
    }

    public static int finder1(String str){

        String[] arr = str.split(" ");

        int max =0;
        String word = "";

        for(int i=0;i<arr.length;i++){
            String temp = arr[i];

            if(max<temp.length()){
                max = temp.length();
                word = temp;
            }

        }
      System.out.println(word);
        return max;
       
    }

    public static int finder2(String str){

        int count =0;
        int max =0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch==' '){

                max = Math.max(max,count);
                count =0;
            }else{
                count++;
            }
        }

         max = Math.max(max,count);

         return max;

    }
}
