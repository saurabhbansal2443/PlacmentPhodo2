package Recursion;

public class printArray {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 6, 9, 5 };

        print(arr, 0);
    }

    public static void print(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);
        print(arr, idx + 1);

         System.out.println(arr[idx]);

    }
}
