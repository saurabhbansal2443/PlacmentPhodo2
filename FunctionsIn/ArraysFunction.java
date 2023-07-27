package FunctionsIn;

import java.util.Arrays;

public class ArraysFunction {
    public static void main(String[] args) {
        int[] arr = {8,9,1,0};

        reverse(arr);

       System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){ // function to reverse an array 
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        //System.out.println(Arrays.toString(arr));

    }
}
