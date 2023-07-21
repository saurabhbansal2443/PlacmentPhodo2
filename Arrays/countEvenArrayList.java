package Arrays;
import java.util.*;
public class countEvenArrayList {
    public static void main(String[] args) {

        int[] data = {1,2,3,3,4,5,6};
      ArrayList<Integer> arr = new ArrayList<>();
      
     for(int i=0;i<data.length;i++){
        arr.add(data[i]);
     }
     int count =0;

     for(int i=0;i<arr.size();i++){

        int ele = arr.get(i);

        if(ele%2==0){
            count++;
        }
     }

     System.out.println(count);
    }
}
