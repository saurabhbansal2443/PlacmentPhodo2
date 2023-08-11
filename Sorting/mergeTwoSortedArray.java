package Sorting;

import java.util.Arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 4, 7, 8, 9, 10, 12 };
        int[] arr2 = { 1, 2, 3, 5, 8 };

        int[] res = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {

            if (arr1[p1] < arr2[p2]) {
                res[p3++] = arr1[p1++];

            } else {
                res[p3++] = arr2[p2++];

            }
        }

        if (p1 == arr1.length) {

            for (int i = p2; i < arr2.length; i++) {
                res[p3++] = arr2[i];
            }
        } else {
            for (int i = p1; i < arr1.length; i++) {
                res[p3++] = arr1[i];
            }
        }

        System.out.println(Arrays.toString(res));

    }
}
