import java.util.Arrays;

public class CallStackExample {

    public static void main(String[] args) {
        int n = 1;
        n = addOne(n);
        int m = addTwo(n);
        int sum = add(n, m);

        int[] arr = onesArray(sum);
        incrementAll(arr);
        int[] arr2 = arr;
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        arr[0] = -1;
    }

    public static int addOne(int n) {
        return n + 1;
    }

    public static int addTwo(int n) {
        n = addOne(n);
        n = addOne(n);
        return n;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int[] onesArray(int length) {
        int[] ones = new int[length];
        for (int i = 0; i < length; i++) {
            ones[i] = 1;
        }
        return ones;
    }

    public static void incrementAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }
    }

}
