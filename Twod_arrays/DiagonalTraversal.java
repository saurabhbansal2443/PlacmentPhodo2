package Twod_arrays;

public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                       { 5, 16, 7, 8 },
                       { 9, 10, 11, 12 },
                       { 19, 101, 131, 126 }
        };
        for(int k=0;k<arr.length;k++){
        for (int r = 0; r < arr.length; r++) {

            for (int c = 0; c < arr[0].length; c++) {
                if (r+k == c) {
                    System.out.print(arr[r][c] + " ");
                }
            }
        }
    }
    }
}
