package Arrays;
import java.util.*;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        // add in arrayList at last 
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        // add at specific index 

        al.add(1,100);

        // remove at specific index

        al.remove(1);

        // get  element from index 

        int ele = al.get(0);

        // replace an element at specific index;

        al.set(1,99);

        // size of arrayList
   
         int size = al.size();

         // empty the arrayList

         //al.clear();




        System.out.println(al.isEmpty());

    }
}
