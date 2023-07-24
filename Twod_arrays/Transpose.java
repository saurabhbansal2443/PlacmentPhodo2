package Twod_arrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                        { 5, 16, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 19, 101, 131, 126 }
                        };

              for(int r=0;r<arr.length;r++){
                for(int c=r;c<arr.length;c++){

                    int temp = arr[r][c];
                    arr[r][c]=arr[c][r];
                    arr[c][r]=temp;
                }
              } 
              
              System.out.println(Arrays.deepToString(arr));

    }
}
