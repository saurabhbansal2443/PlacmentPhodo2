package Twod_arrays;

import java.util.Arrays;

public class ReverseRows {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                        { 5, 16, 7, 8 },
                        { 9, 10, 11, 12 },
       
                        };

              for(int i=0;i<arr.length;i++){
                int[] temp = arr[i];

                int start=0;
                int end = temp.length-1;

                while(start<end){
                    int k = temp[start];
                    temp[start]=temp[end];
                    temp[end]=k;
                    start++;
                    end--;
                }
              }
              
              System.out.println(Arrays.deepToString(arr));
    }
}
