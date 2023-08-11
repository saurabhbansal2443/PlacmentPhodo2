package BinarySearch;

public class minimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 80, 90, 100, 110, 200,  40, 50, 60, 70 };

        int start = 0;
        int end = arr.length-1;

        if(arr[start]<=arr[end]){
            System.out.println(arr[start]);
        }

        while(start<=end){

            int mid = (start + end)/2;

            if(mid!=arr.length-1 && arr[mid]>arr[mid+1]){
                System.out.println(arr[mid+1]);
                break;
            }else if ( mid!=0 && arr[mid]<arr[mid-1]){
                  System.out.println(arr[mid]);
                break;
            }else if ( arr[start]<=arr[mid]){
                start = mid+1;
            }else{
                end =mid-1;
            }
        
        }




    }
}
