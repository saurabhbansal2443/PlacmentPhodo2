package Arrays;

public class firstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 20, 40, 20, 34, 20, 23 };

        int k = 40;

        int lo = -1;
        int fo = -1;

        // // last occurence

        // for(int i=0;i<arr.length;i++){
        // if(arr[i]==k){
        // lo = i;
        // }
        // }

        // System.out.println(lo);

        // // first Occurence

        // for(int i=arr.length-1;i>=0;i--){
        // if(arr[i]==k){
        // fo= i;
        // }
        // }

        // System.out.println(fo);

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k && flag == true) {
                fo = i;
                lo = i;
                flag = false;
            }

            else if (arr[i] == k) {
                lo = i;

            }
        }

        System.out.println(fo + "  " + lo);

    }
}
