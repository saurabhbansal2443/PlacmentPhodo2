package Twod_arrays;

public class colWiseMin {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, 4 },
                       { 5, 16, 7, 8 },
                       { 9, 10, 11, 12 }
};

         for (int c = 0; c < arr[0].length; c++) {
                    int min = Integer.MAX_VALUE;
                for (int r = 0; r < arr.length; r++) {
    
                   if(min>arr[r][c]){
                    min = arr[r][c];
                   }
                }
                System.out.println(min);
            }

            
                
    }
}
