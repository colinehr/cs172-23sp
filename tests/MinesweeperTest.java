import static org.junit.jupiter.api.Assertions.*;

class MinesweeperTest {

    @org.junit.jupiter.api.Test
    void initMines() {
        boolean[][] mines = Minesweeper.initMines(10);
        int mineCount = 0;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (mines[row][col]) {
                    mineCount++;
                }
            }
        }
        assertEquals(10, mineCount);
    }
}