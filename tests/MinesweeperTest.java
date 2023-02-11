import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinesweeperTest {

    @org.junit.jupiter.api.Test
    void initMines() {
        boolean[][] mines = Minesweeper.initMines(8, 8,10);
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

    @Test
    void countNeighboringMines() {
        // initialize a mines array; notice it will be the same every time
        boolean[][] mines = new boolean[3][3];
        mines[0][1] = true;
        mines[2][2] = true;
        /* the mines array looks something like:
            false true  false
            false false false
            false false true
         */
        assertEquals(2, Minesweeper.countNeighboringMines(mines, 1, 1));
        assertEquals(1, Minesweeper.countNeighboringMines(mines, 0, 0));
        // what could one more test look like?
    }
}