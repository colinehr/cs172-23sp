import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadTest {

    @Test
    void testEquals() {
        assertEquals(new Quad(5.0), new Quad(5.0));
    }
}