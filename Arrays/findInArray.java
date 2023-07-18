package Arrays;

public class findInArray {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 30, 40, 60, 34, 89, 23 };

            int k = 100;

            int idx = -1;

            for(int i=0;i<arr.length;i++){

                if(arr[i]==k){
                    idx=i;
                }
            }

            System.out.println(idx);
    }

}
