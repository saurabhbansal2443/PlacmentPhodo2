package Recursion;

public class FibonnaciSeries {
    public static void main(String[] args) {
        int n = 3;

        int ans =fib(n);

        System.out.println(ans);
    }

    public static int fib(int n){

        if(n==1){
            return 0;
        }else if ( n==2){
            return 1;
        }

        int p = fib(n-1);
        int pp = fib(n-2);

        int ans = p+ pp;

        return ans ;

    }
}
