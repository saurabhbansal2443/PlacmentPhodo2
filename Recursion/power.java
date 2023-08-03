package Recursion;

public class power {
    public static void main(String[] args) {
        int n = 2;
        int x = 5;

        int an1 = calculate1(n, x);
         int ans2 = calculate2(n, x);


        System.out.println(ans2);
    }

    public static int calculate1(int n , int x){
        if(x==0|| n==1){
            return 1;
        }else if ( x==1){
            return n;
        }else {

            int remAns = calculate1(n,x-1);
            return n *remAns;
        }
    }

    public static int calculate2(int n, int x){
         if(x==0|| n==1){
            return 1;
        }else if ( x==1){
            return n;
        }

        int preAns  = calculate2(n, x/2);

        if(x%2==0){
            return preAns*preAns;
        }else {
            return preAns * preAns *n;
        }


    }
}
