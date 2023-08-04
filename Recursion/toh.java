package Recursion;

public class toh {
    public static void main(String[] args) {
        int n = 3;

        print(n, 'S', 'D', 'H');
    }

    public static void print(int n, char S, char D, char H) {
        if (n == 0)
            return;

        if (n == 1) {
            System.out.println(n + "[ " + S + " -> " + D + " ]");
            return;
        }

        print(n - 1, S, H, D);
        System.out.println(n + "[ " + S + " -> " + D + " ]");
        print(n - 1, H, D, S);

    }
}
