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
}