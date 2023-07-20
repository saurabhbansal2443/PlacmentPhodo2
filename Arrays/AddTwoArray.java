package Arrays;

import java.util.Arrays;

public class AddTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 9, 9, 1, 3, 7, 6, 5 };
        int[] arr2 = { 8, 9, 3, 4 };

        int resLength = Math.max(arr1.length, arr2.length);

        int[] res = new int[resLength];

        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;
        int p3 = res.length - 1;

        int carry = 0;

        while (p1 >= 0 || p2 >= 0) {
            int val1 = p1 < 0 ? 0 : arr1[p1];
            int val2 = p2 < 0 ? 0 : arr2[p2];

            int sum = val1 + val2 + carry;

            int d = sum % 10;
            carry = sum / 10;

            res[p3] = d;

            p1--;
            p2--;
            p3--;
        }
        if (carry > 0) {
            int[] res2 = new int[res.length + 1];
            res2[0] = carry;
            for (int i = 0; i < res.length; i++) {
                res2[i + 1] = res[i];
            }
            res = res2;
        }

        System.out.println(Arrays.toString(res));
    }
}
