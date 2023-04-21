public interface Stack<E> extends Iterable<E> {

    boolean isEmpty();

    E push(E item);

    E peek();

    E pop();

}
