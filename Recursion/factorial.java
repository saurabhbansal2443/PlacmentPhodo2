package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 5;

        int ans = fact(n);

        System.out.println(ans);
    }

    public static int fact(int n){

        if(n==0 || n==1){
            return 1;
        }

        int preAns = fact(n-1);

        int ans = n * preAns;

        return ans ;
    }


}
