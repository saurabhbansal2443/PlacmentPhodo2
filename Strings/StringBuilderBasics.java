import java.util.*;
public class StringBuilderBasics {
    public static void main(String[] args) {
       
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");

        sb.insert(1,"Game");

        sb.delete(1, 5);

        sb.deleteCharAt(2);

        sb.replace(1,3, "JKpp");

        //sb.reverse();

        String str = sb.substring(7);

        System.out.println(sb.toString());
    }
}
