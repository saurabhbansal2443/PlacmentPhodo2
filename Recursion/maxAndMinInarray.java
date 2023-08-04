package Recursion;

public class maxAndMinInarray {
    public static void main(String[] args) {
        int[] arr = {5,7,9,1,2,0,6};

        int ans = maxOfArray(arr, 0);

        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr , int idx ){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int preMax = maxOfArray(arr, idx+1);

        int max = Math.max(preMax,arr[idx]);

        return max;
    }

    public static int minOfArray(int[] arr , int idx ){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int preMin = minOfArray(arr, idx+1);

        int min = Math.min(preMin,arr[idx]);

        return min;
    }
}
