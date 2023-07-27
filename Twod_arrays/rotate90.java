package Twod_arrays;

import java.util.Arrays;

public class rotate90 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3},
                       { 5, 16, 7 },
                      { 9, 10, 11 }
        };

        for (int r = 0; r < arr.length; r++) {
            for (int c = r; c < arr.length; c++) {

                int temp = arr[r][c];
                arr[r][c] = arr[c][r];
                arr[c][r] = temp;
            }
        }

        //System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            int[] temp = arr[i];

            int start = 0;
            int end = temp.length - 1;

            while (start < end) {
                int k = temp[start];
                temp[start] = temp[end];
                temp[end] = k;
                start++;
                end--;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
