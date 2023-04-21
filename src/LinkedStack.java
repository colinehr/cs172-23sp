import java.util.EmptyStackException;
import java.util.Iterator;

public class LinkedStack<E> implements Stack<E> {

    private Node first;

    private class Node {
        E item;
        Node next;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public E push(E item) {
        Node fresh = new Node();
        fresh.item = item;
        fresh.next = this.first;
        this.first = fresh;
        return item;
    }

    public E peek() {
        try {
            return this.first.item;
        } catch (NullPointerException e) { throw new EmptyStackException(); }
    }

    public E pop() {
        E top = this.peek();
        this.first = first.next;
        return top;
    }

    private class LinkedStackIterator implements Iterator<E> {

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E item = this.current.item;
            this.current = this.current.next;
            return item;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedStackIterator();
    }

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        for (int n : stack) {
            StdOut.println(n);
        }
    }

}
