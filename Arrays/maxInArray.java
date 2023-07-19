package Arrays;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 20, 40, 20, 34, 20, 23 };

          int max = Integer.MIN_VALUE;

          for(int i=0;i<arr.length;i++){
             if(max<arr[i]){
                max=arr[i];
             }
          }

          System.out.println(max);
    }
}
