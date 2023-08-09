package Recursion;

import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;

        ArrayList<String> ans = new ArrayList<>();
        paths(0,0,r-1,c-1,"",ans);
        System.out.println(ans);
    }

    public static void paths(int sr , int sc , int dr , int dc , String str , ArrayList<String> ans  ){

      
        if(sc>dc || sr>dr){
            return  ;
        }

        if(sr==dr && sc == dc){
            ans.add(str);
            return  ;
        }

        paths(sr, sc+1, dr, dc, str+"H", ans);
        paths(sr+1, sc, dr, dc, str+"V", ans);


    }
}
