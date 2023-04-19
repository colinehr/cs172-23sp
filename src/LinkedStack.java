import java.util.EmptyStackException;

public class LinkedStack {

    private Node first;
    private int size;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public String push(String item) {
        Node fresh = new Node();
        fresh.item = item;
        fresh.next = this.first;
        this.first = fresh;
        return item;
    }

    public String peek() {
        try {
            return this.first.item;
        } catch (NullPointerException e) { throw new EmptyStackException(); }
    }

    public String pop() {
        String top = this.peek();
        this.first = first.next;
        return top;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push("abc");
        stack.push("def");
        StdOut.println(stack.pop()); // should be "def"
        StdOut.println(stack.pop()); // should be "abc"
        StdOut.println(stack.pop()); // bad!
    }

}
