package Arrays;

import java.util.Arrays;

public class concatArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {8,1,5,4};

        int[] res = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            res[i]=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            res[arr1.length+i]=arr2[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
