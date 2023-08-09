package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,3,1,0,7,5,2,8,4,6};

        for(int i=0;i<arr.length-1;i++){
            for(int j= i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void  swap(int[] arr , int i , int j){

        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}


