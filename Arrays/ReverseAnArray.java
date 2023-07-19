package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 9, 1, 0 ,3};

        // 1st approach using new array 

        // int[] res = new int[arr.length];

        // for(int i=arr.length-1;i>=0;i--){
        //     res[arr.length-1-i]=arr[i];
        // }
         
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
