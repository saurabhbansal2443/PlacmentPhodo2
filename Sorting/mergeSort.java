package Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 1, 0, 7, 5, 2, 8, 4, 6 };

        int[] res = merge(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(res));
    }   

    public static int[] merge(int[] arr, int st, int end) {

        if (st == end) {

            int[] temp = new int[1];
            temp[0] = arr[st];

            return temp;
        }
        int mid = (st + end)/2;

        int[] fsp =  merge(arr,st,mid);
        int[] ssp = merge(arr,mid+1,end);

        int[] res = mergeTwoSortedArray(fsp, ssp);

        return res;
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
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

        return res;
    }
}
