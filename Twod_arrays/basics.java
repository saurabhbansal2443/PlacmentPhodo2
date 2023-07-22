package Twod_arrays;

public class basics {
    public static void main(String[] args) {

        // 1 declartaion and Intialization 
        // int[][] arr = new int[3][4];

        //
        



        // 2 how to give values to 2d array 

        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12}
                      };

        //  int rows = arr.length;
        // int col = arr[0].length;

        // System.out.println(rows + " " + col);

        // access an element 


        //System.out.println(arr[1][2]);

        // iterate in 2d array 

          for(int r=0;r<arr.length;r++){

              for(int c = 0 ;c<arr[0].length;c++){
                System.out.print(arr[r][c]+"  ");
              }

              System.out.println();
          }
    }
}
