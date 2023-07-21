package Arrays;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
          int[] data = {1,2,3,3,4,2,2,1,3,5,3,4,5,5,6};
      ArrayList<Integer> arr = new ArrayList<>();
      
     for(int i=0;i<data.length;i++){
        arr.add(data[i]);
     }

     ArrayList<Integer> ans = new ArrayList<>();


         for(int i=0;i<arr.size();i++){
              int ele = arr.get(i);

           if(ans.contains(ele)==false){
                ans.add(ele);
             }
       }

     System.out.println(ans);


    }
}
