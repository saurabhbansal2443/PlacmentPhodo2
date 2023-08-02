package Recursion;

public class PrintDecresing {
    public static void main(String[] args) {
        int n = 10;

        print(n);

    }

    public static void print(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n - 1);
    }
}
