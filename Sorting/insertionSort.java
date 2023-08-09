package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 1, 0, 7, 5, 2, 8, 4, 6 };

        for(int i=1;i<arr.length;i++){

            for(int j=i;j>0;j--){

                if(arr[j-1]> arr[j]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}
