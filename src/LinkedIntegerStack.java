import java.util.EmptyStackException;

public class LinkedIntegerStack {

    private Node first;
    private int size;

    private class Node {
        int item;
        Node next;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public int push(int item) {
        Node fresh = new Node();
        fresh.item = item;
        fresh.next = this.first;
        this.first = fresh;
        return item;
    }

    public int peek() {
        try {
            return this.first.item;
        } catch (NullPointerException e) { throw new EmptyStackException(); }
    }

    public int pop() {
        int top = this.peek();
        this.first = first.next;
        return top;
    }

    public static void main(String[] args) {
        LinkedIntegerStack stack = new LinkedIntegerStack();
        stack.push(1);
        stack.push(2);
        StdOut.println(stack.pop()); // should be "def"
        StdOut.println(stack.pop()); // should be "abc"
        StdOut.println(stack.pop()); // bad!
    }

}
