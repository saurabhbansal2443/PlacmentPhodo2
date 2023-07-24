package Twod_arrays;

public class maxSumOfRow {
    public static void main(String[] args) {
        int[][] arr = { { 10000, 2, 3, 4 },
                { 500, 16, 7, 8 },
                { 9, 10, 11, 12 }
        };

        int max = 0;
        int rowMax = 0;

        for (int r = 0; r < arr.length; r++) {

            int currSum = 0;

            for (int c = 0; c < arr[0].length; c++) { // help to make sum of row
                currSum += arr[r][c];

            }

            if (max < currSum) { // it will compare currsum with max
                max = currSum;
                rowMax = r;
            }

        }

        System.out.println(rowMax);
    }
}
