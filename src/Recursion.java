public class Recursion {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        return (int) Math.round(Math.sqrt(5) / 2);
    }
    public static void main(String[] args) {
        StdOut.println("Hello world!");
        StdOut.println(fibonacci(1000));
    }
}