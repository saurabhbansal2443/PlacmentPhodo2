package Arrays;

public class FindAllOccurence {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 20, 40, 20, 34, 20, 23 };

        int k = 20 ;
        int count =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
