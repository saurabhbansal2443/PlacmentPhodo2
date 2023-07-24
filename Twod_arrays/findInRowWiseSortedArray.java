package Twod_arrays;

public class findInRowWiseSortedArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 7, 9, 13 },
                     { 21, 27, 31, 61 },
                     { 63, 65, 72, 77 },
                     { 105, 203, 213, 220 }
        };

        int k = 100;
        int ansRow = -1;
        int ansCol = -1;

        int r = 0;
        int c = arr[0].length - 1;

        while (r < arr.length && c >= 0) {

            if (arr[r][c] == k) {
                ansRow = r;
                ansCol = c;
                break;
            } else if (arr[r][c] < k) {
                r++;
            } else if (arr[r][c] > k) {
                c--;
            }

        }

        System.out.println(ansRow + " " + ansCol);

    }
}
