public class Minesweeper {

    public static boolean[][] initMines(int numMines) {
        boolean[][] mines = new boolean[8][8];
        for (int i = 0; i < numMines; i++) {
            int row = StdRandom.uniformInt(8);
            int col = StdRandom.uniformInt(8);
            if (mines[row][col]) {
                i--;
            } else {
                mines[row][col] = true;
            }
        }
        return mines;
    }

    public static void main(String[] args) {
        boolean[][] mines = initMines(10);

        StdDraw.setXscale(0, 8);
        StdDraw.setYscale(0, 8);
        // draw grid
        for (int i = 1; i < 8; i++) {
            StdDraw.line(i, 0, i, 8);
            StdDraw.line(0, i, 8, i);
        }
        // draw mines
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (mines[row][col]) {
                    StdDraw.filledCircle(col + 0.5, row + 0.5, 0.25);
                }
            }
        }
    }

}
