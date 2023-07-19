package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 10, 70, 90, 50, 20, 40, 20, 34, 20, 23 };

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(max<arr[i]){
                smax = max;
                max=arr[i];
            }else if(smax<arr[i]){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
