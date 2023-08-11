package BinarySearch;

public class rotatedSorted {
    public static void main(String[] args) {
        int[] arr = { 80, 90, 100, 110, 10, 20, 30, 40, 50, 60, 70 };

        int start = 0;
        int end = arr.length -1 ;

        int k = 70 ;
        int ans  = -1 ;

        while(start<=end){
            int mid = (start + end)/2;

            if(k == arr[mid] ){
                ans = mid;
                break;
            }else if ( arr[start]<=arr[mid] ){  // left part sorted 
               
                if(k>=arr[start] && k<arr[mid]){ 
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            } else{                             // right part sorted 

                if(k>arr[mid] && k<=arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        System.out.println(ans);
    }
}
