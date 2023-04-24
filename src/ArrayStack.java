import java.util.EmptyStackException;
import java.util.Iterator;

public class ArrayStack<E> implements Iterable<E> {

    private E[] array;
    private int size;

    /**
     * Creates an empty stack.
     */
    @SuppressWarnings("unchecked") // this does not affect the code, just shushes IntelliJ :)
    public ArrayStack() {
        this.array = (E[]) new Object[100]; // workaround to initialize an array of type E
        this.size = 0;
    }

    /**
     * Tests if this stack is empty.
     *
     * @return <code>true</code> if and only if this stack contains no items; <code>false</code> otherwise.
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack.
     * @return the item argument.
     */
    public E push(E item) {
        this.array[size] = item;
        this.size++;
        return item;
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return the object at the top of this stack
     * @throws EmptyStackException if the stack is empty
     */
    public E peek() {
        try {
            return this.array[size - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     * @return the object at the top of this stack
     * @throws EmptyStackException if the stack is empty
     */
    public E pop() {
        E top = this.peek();
        this.array[size - 1] = null;
        this.size--;
        return top;
    }

    /**
     * Creates and returns a new iterator for this stack which starts at the top.
     *
     * @return the iterator of this stack.
     */
    public Iterator<E> iterator() {
        return new ArrayStack.ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<E> {

        /** Where we are in the stack. */
        int i = size - 1;

        /**
         * Tests if there are more elements in this stack to iterate through.
         * @return <code>true</code> if there are more elements to iterate through, <code>false</code> otherwise.
         */
        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        /**
         * Returns the element of this stack that comes after the previous one (i.e., the element returned by the last
         * call to this function).
         * @return the next element in this stack
         */
        @Override
        public E next() {
            E item = array[i];
            i--;
            return item;
        }
    }

    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("abc");
        stack.push("def");

        for (String str : stack) {
            StdOut.println(str);
        }
    }

}
