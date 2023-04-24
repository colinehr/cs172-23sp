import java.util.EmptyStackException;
import java.util.Iterator;

public interface Stack<E> extends Iterable<E> {
    /**
     * Tests if this stack is empty.
     *
     * @return <code>true</code> if and only if this stack contains no items; <code>false</code> otherwise.
     */
    boolean isEmpty();

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack.
     * @return the item argument.
     */
    E push(E item);

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return the object at the top of this stack
     * @throws EmptyStackException if the stack is empty
     */
    E peek();

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     * @return the object at the top of this stack
     * @throws EmptyStackException if the stack is empty
     */
    E pop();

    /**
     * Creates and returns a new iterator for this stack which starts at the top.
     *
     * @return the iterator of this stack.
     */
    @Override
    Iterator<E> iterator();
}
