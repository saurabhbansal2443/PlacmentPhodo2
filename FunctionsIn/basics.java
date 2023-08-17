package FunctionsIn;

public class basics {
    public static void main(String[] args) {
        int n = 153;

        int ans = armStrong(n);

        // if (n == ans) {
        //     System.out.println("True");
        // } else {
        //     System.out.println("False");
        // }

        System.out.println(max(3,4 ,8));

    }

    public static int armStrong(int number) {

        int sum = 0;

        while (number > 0) {
            int d = number % 10;
            number = number / 10;

            sum = sum + d * d * d;
        }

        return sum;

    }

    public static  int max(int a , int b){
        return Math.max(a,b);
    }

    public static int max(int a , int b , int c){
        return Math.max(Math.max(a,b),c);
    }
}
