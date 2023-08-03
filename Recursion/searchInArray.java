package Recursion;

public class searchInArray {
    public static void main(String[] args) {
        int[] arr = {6,8,3,2,0,1,5};
        int k = 10;

        int ans = find( arr ,k,0 );
        System.out.println(ans);
    }

    public static int find(int[] arr , int k , int idx){

        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==k){
            return idx;
        }

        int ans = find(arr,k,idx+1);

        return ans ;
    }
}
