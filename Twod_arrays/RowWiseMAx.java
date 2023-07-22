package Twod_arrays;

public class RowWiseMAx {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                        { 5, 16, 7, 8 },
                        { 9, 10, 11, 12 }
        };

        for(int r=0;r<arr.length;r++){

            int max  = Integer.MIN_VALUE;

            for(int c=0;c<arr[0].length;c++){

                if(max<arr[r][c]){
                    max = arr[r][c];
                }

            }

            System.out.println(max);
        }
    }
}
