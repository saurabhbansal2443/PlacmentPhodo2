package Arrays;

import java.util.Arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,6,10,12,18,20,22,23,24};
        int[] arr2 = {2,3,5,5,6,8,9,10};

        int[] res = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1<arr1.length && p2<arr2.length){

            if(arr1[p1]<arr2[p2]){
                res[p3]=arr1[p1];
                p1++;
                p3++;
            }else{
                res[p3]=arr2[p2];
                p2++;
                p3++;
            }
        }

        if(p1==arr1.length){

            for(int i=p2;i<arr2.length;i++){
                res[p3]=arr2[i];
                p3++;
            }
        }else{
            for(int i=p1;i<arr1.length;i++){
                res[p3]=arr1[i];
                p3++;
            }
        }

           System.out.println(Arrays.toString(res));
           


    }
}
