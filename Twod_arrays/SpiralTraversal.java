package Twod_arrays;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 16, 7, 8 },
                { 9, 10, 11, 12 }
        };

        int ele = arr.length * arr[0].length;
        int count = 0;

        int rowMin = 0;
        int rowMax = arr.length - 1;
        int colMin = 0;
        int colMax = arr[0].length - 1;

        while (count < ele) {

            // 1st loop // colmin constant rowmin-> rowmax

            for (int r = rowMin; r <= rowMax; r++) {
                System.out.println(arr[r][colMin]);
                count++;
            }

            // 2nd loop // rowmax constant colmin+1 -> colmax

            for (int c = colMin + 1; c <= colMax; c++) {
                System.out.println(arr[rowMax][c]);
                count++;
            }

            // 3rd loop // colmax constant rowmax-1 -> rowmin

            for (int r = rowMax - 1; r >= rowMin; r--) {
                System.out.println(arr[r][colMax]);
                count++;
            }

            // 4th loop // rowmin constant colmax-1 -> colmin+1

            for (int c = colMax - 1; c >= colMin + 1; c--) {

                System.out.println(arr[rowMin][c]);
                count++;
            }

            rowMin++;
            rowMax--;
            colMin++;
            colMax--;

        }
    }
}
