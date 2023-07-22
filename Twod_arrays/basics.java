package Twod_arrays;

import java.util.Arrays;

public class basics {
    public static void main(String[] args) {

        // 1 declartaion and Intialization
        // int[][] arr = new int[3][4];

        //

        // 2 how to give values to 2d array

        int[][] arr = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 }
        };

        int[][] arr2 = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        // int rows = arr.length;
        // int col = arr[0].length;

        // System.out.println(rows + " " + col);

        // access an element

        // System.out.println(arr[1][2]);

        // iterate in 2d array

        // for(int r=0;r<arr.length;r++){

        // for(int c = 0 ;c<arr[0].length;c++){
        // System.out.print(arr[r][c]+" ");
        // }

        // System.out.println();
        // }

        // Sum of array
        // int sum = 0;

        // for (int r = 0; r < arr.length; r++) {

        // for (int c = 0; c < arr[0].length; c++) {
        // sum += arr[r][c];
        // }

        // }

        // System.out.println(sum);

        // max of a array

        // int max = Integer.MIN_VALUE;

        // for (int r = 0; r < arr.length; r++) {

        // for (int c = 0; c < arr[0].length; c++) {
        // if (max < arr[r][c]) {
        // max = arr[r][c];
        // }

        // }
        // }

        // System.out.println(max);

        // check if two arrays are equal or not

        // boolean ans = true;

        // if (arr.length == arr2.length && arr[0].length == arr2[0].length) {

        // for (int r = 0; r < arr.length; r++) {

        // for (int c = 0; c < arr[0].length; c++) {
        // if(arr[r][c]!=arr2[r][c]){
        // ans = false;
        // break;
        // }
        // }
        // }

        // } else {
        // ans = false;
        // }

        // System.out.println(ans);

        // copy an array ;

        //int[][] res = new int[arr.length][arr[0].length];

        // for (int r = 0; r < arr.length; r++) {

        //     for (int c = 0; c < arr[0].length; c++) {

        //         res[r][c] = arr[r][c];
        //     }
        // }

        //System.out.println(Arrays.deepToString(arr));

        // print column wise

        // for (int c = 0; c < arr[0].length; c++) {

        //     for (int r = 0; r < arr.length; r++) {

        //        System.out.print(arr[r][c]+" ");
        //     }
        //     System.out.println();
        // }
      
        // find k in 2d array 
              int k = 9;
              int ri = -1;
              int ci = -1;
        for (int r = 0; r < arr.length; r++) {

            for (int c = 0; c < arr[0].length; c++) {

               if(arr[r][c]==k){
                ri=r;
                ci=c;
               }
            }
        }

        System.out.println(ri + "   " + ci);


    }
}
