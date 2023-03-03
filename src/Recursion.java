public class Recursion {

    static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        return add(a, b - 1) + 1;
    }

    static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        return multiply(a, b - 1) + a;
    }

    static int choose(int n, int k) {
        if (n == 0) {
            return 1;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return choose(n - 1, k - 1) + choose(n - 1, k);
    }

    static int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return count7(n / 10) + 1;
        }
        return count7(n / 10);
    }

    public static void main(String[] args) {
        StdOut.println(count7(717));
    }
}