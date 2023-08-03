package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;

        int ans = sum(n);

        System.out.println(ans);
    }

    public static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }

        int d = n%10;
        int remSum = sum(n/10);

        return d+remSum;
    }


}
