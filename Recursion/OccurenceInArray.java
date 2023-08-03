package Recursion;

public class OccurenceInArray {
    public static void main(String[] args) {
        int[] arr = {6,4,3,7,3,9,3,1,0};

        int k = 3;

        int ans1 = firstOccurence(arr, k,0);
         int ans2 = LastOccurence(arr, k,arr.length-1);
          AllOccurence(arr, k,0);

        //System.out.println(ans2);
    }

    public static int firstOccurence(int[] arr , int k , int idx ){
          if(idx==arr.length){
            return -1;
          }

          if(arr[idx]==k){
            return idx;
          }

          int ans = firstOccurence(arr, k, idx+1);
          return ans ;
    }

     public static int LastOccurence(int[] arr , int k , int idx){
         if(idx==-1){
            return -1;
          }

          if(arr[idx]==k){
            return idx;
          }

          int ans = LastOccurence(arr, k, idx-1);

          return ans ;
    }

     public static void AllOccurence(int[] arr , int k , int idx){
          if(idx==arr.length){
            return ;
          }

          if(arr[idx]==k){
           System.out.println(idx);
          }

          AllOccurence(arr, k, idx+1);
        
    }
}
