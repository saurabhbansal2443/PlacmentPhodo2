package Arrays;

public class rangeInarray {
    public static void main(String[] args) {
        int[] arr = {7,2,6,5,4,1};

        int n = arr.length+1;

        int sum = 0;

        int ogSum = (n*(n+1))/2;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }



        int diff = ogSum - sum;

        System.out.println(diff);

    }
}
