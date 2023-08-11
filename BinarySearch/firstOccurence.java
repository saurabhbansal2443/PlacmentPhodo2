package BinarySearch;

public class firstOccurence {
    public static void main(String[] args) {
        int[] arr = { 10, 10, 20, 20, 20, 60, 70, 80, 90, 100, 110 };

        int k = 60;

        int ans1 = fo(arr, k);
        int ans2 = lo(arr,k);

        int allOccurence = ans2 - ans1 + 1;


        System.out.println(allOccurence);

    }

    public static int fo(int[] arr, int k) {

        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (k == arr[mid]) {
                ans = mid;
                end = mid - 1;
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;

    }

    public static int lo(int[] arr, int k) {

        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (k == arr[mid]) {
                ans = mid;
               start = mid +1;
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;

    }
}
