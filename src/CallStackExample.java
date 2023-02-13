public class CallStackExample {

    public static void main(String[] args) {
        int n = 1;
        n = addOne(n);
        int m = addTwo(n);
        int sum = add(n, m);
    }

    public static int addOne(int n) {
        return n + 1;
    }

    public static int addTwo(int n) {
        addOne(n);
        addOne(n);
        return n;
    }

    public static int add(int x, int y) {
        return x + y;
    }

}
