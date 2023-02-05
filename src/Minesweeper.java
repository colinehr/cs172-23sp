public class Minesweeper {

    public static boolean[][] initMines(int width, int height, int numMines) {
        boolean[][] mines = new boolean[height][width];
        for (int i = 0; i < numMines; i++) {
            int row = StdRandom.uniformInt(height);
            int col = StdRandom.uniformInt(width);
            if (mines[row][col]) {
                i--;
            } else {
                mines[row][col] = true;
            }
        }
        return mines;
    }

    public static void drawGrid(int width, int height) {
        for (int x = 1; x < width; x++) {
            StdDraw.line(x, 0, x, height);
        }
        for (int y = 1; y < height; y++) {
            StdDraw.line(0, y, width, y);
        }
    }

    public static void drawMines(boolean[][] mines) {
        for (int row = 0; row < mines.length; row++) {
            for (int col = 0; col < mines[0].length; col++) {
                if (mines[row][col]) {
                    StdDraw.filledCircle(col + 0.5, row + 0.5, 0.25);
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[][] mines = initMines(8, 8, 10);

        StdDraw.setXscale(0, 8);
        StdDraw.setYscale(0, 8);
        StdDraw.enableDoubleBuffering();

        drawGrid(8, 8);
        drawMines(mines);
        StdDraw.show();
    }

}
