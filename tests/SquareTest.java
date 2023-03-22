import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void area() {
        Square sq = new Square(0, 0, 3);
        assertEquals(9, sq.area());
    }

    @Test
    void perimeter() {
    }
}