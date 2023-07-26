package Twod_arrays;

public class ExitPointOfMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 1, 0 },
                        { 0, 1, 0, 1 },
                        { 1, 1, 1, 0 }
        };

        int dir = 0;

        int r = 0;
        int c = 0;

        while (true) {

            dir = (dir + arr[r][c]) % 4;

            arr[r][c] = 0;

            if (dir == 0) {
                c++;
            } else if (dir == 1) {
                r++;
            } else if (dir == 2) {
                c--;
            } else if (dir == 3) {
                r--;
            }

            if (c == arr[0].length) {
                c--;
                break;
            } else if (c == -1) {
                c++;
                break;
            } else if (r == arr.length) {
                r--;
                break;
            } else if (r == -1) {
                r++;
                break;
            }

        }

        System.out.println(r + "  " + c);
    }
}
