package BinarySearch;

public class basics {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110};

        int k = 0;

        int start = 0;
        int end = arr.length-1;

        int ans = -1 ;

        while(start<=end){

            int mid = (start + end)/2;

            if(k == arr[mid]){
                ans = mid;
                break;
            }else if ( k > arr[mid]){
                start = mid+1;
            }else if ( k < arr[mid]){
                end = mid -1 ;
            }
        }


        System.out.println(ans);


    }
}
