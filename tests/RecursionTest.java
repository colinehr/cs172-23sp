import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RecursionTest {

    @Test
    void factorial() {
        assertEquals(24, Recursion.factorial(4));
        assertEquals(6, Recursion.factorial(3));
        assertEquals(1, Recursion.factorial(1));
    }

    @Test
    void fibonacci() {
        assertEquals(1, Recursion.fibonacci(0));
        assertEquals(2, Recursion.fibonacci(2));
        assertEquals(13, Recursion.fibonacci(6));
    }

    @Test
    void choose() {
        assertEquals(1, Recursion.choose(0, 0));
        assertEquals(1, Recursion.choose(5, 0));
        assertEquals(1, Recursion.choose(4, 4));
        assertEquals(3, Recursion.choose(3, 2));
        assertEquals(6, Recursion.choose(4, 2));
    }

    @Test
    void count7() {
        assertEquals(2, Recursion.count7(717));
        assertEquals(1, Recursion.count7(71));
        assertEquals(0, Recursion.count7(615));
    }
}