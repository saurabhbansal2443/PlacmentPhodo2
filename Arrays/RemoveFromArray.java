package Arrays;

import java.util.Arrays;

public class RemoveFromArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1,8,9,7,6};

        int k = 9;

        int[] res = new int[arr.length-1];

        int itr = 0;

        for(int i=0;i<arr.length;i++){

            if(k!=arr[i]){
                res[itr]=arr[i];
                itr++;
            }
        }

        System.out.println(Arrays.toString(res));


    }
}
