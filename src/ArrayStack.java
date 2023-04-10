public class ArrayStack {

    private String[] array;
    private int size;

    public ArrayStack() {
        this.array = new String[100];
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public String push(String item) {
        this.array[size] = item;
        this.size++;
        return item;
    }

    public String peek() {
        return this.array[size - 1];
    }

    public String pop() {
        String top = this.peek();
        this.array[size - 1] = null;
        this.size--;
        return top;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push("abc");
        stack.push("def");
        StdOut.println(stack.pop()); // should be "def"
        StdOut.println(stack.pop()); // should be "abc"
        StdOut.println(stack.pop()); // bad!
    }

}
