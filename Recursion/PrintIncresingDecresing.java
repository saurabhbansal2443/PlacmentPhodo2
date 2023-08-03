package Recursion;

public class PrintIncresingDecresing {
    public static void main(String[] args) {
        int n = 4;

        print(n);

    }

    public static void print(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }
}
