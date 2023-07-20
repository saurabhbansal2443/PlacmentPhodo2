package Arrays;

public class Barchart {
    public static void main(String[] args) {
        int[] arr ={5,1,7,3,4,2,1};

        int max = Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

            for(int i=max ;i>0;i--){
                int h=i;

                for(int j=0;j<arr.length;j++){
                    if(h<=arr[j]){
                        System.out.print("*\t");
                    }else{
                         System.out.print("\t");
                    }
                }

                 System.out.println();
            }
    }
}
