public class Minesweeper {

    public static void main(String[] args) {
        boolean[][] mines = initMines(8, 8, 10);
        boolean[][] revealed = new boolean[8][8];

        StdDraw.setXscale(0, 8);
        StdDraw.setYscale(0, 8);
        StdDraw.enableDoubleBuffering();

        drawGrid(8, 8);
        drawGame(mines, revealed);

        while (true) {
            handleMouseClick(mines, revealed);
            drawGame(mines, revealed);
        }
    }

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

    public static void drawGame(boolean[][] mines, boolean[][] revealed) {
        drawGrid(mines.length, mines[0].length);
        for (int row = 0; row < mines.length; row++) {
            for (int col = 0; col < mines[0].length; col++) {
                if (revealed[row][col] && mines[row][col]) {
                    StdDraw.filledCircle(col + 0.5, row + 0.5, 0.25);
                } else if (revealed[row][col] && !mines[row][col]) {
                    int neighbors = countNeighboringMines(mines, row, col);
                    StdDraw.text(col + 0.5, row + 0.5, String.valueOf(neighbors));
                }
            }
        }
        StdDraw.show();
    }

    public static void handleMouseClick(boolean[][] mines, boolean[][] revealed) {
        if (StdDraw.isMousePressed()) {
            int x = (int) StdDraw.mouseX();
            int y = (int) StdDraw.mouseY();
            reveal(mines, revealed, y, x);
        }
    }

    public static int countNeighboringMines(boolean[][] mines, int row, int col) {
        int count = 0;
        // ... calculate the count ...
        int dRow = -1;
        while (dRow <= 1) {
            int dCol = -1;
            while (dCol <= 1) {
                // this doesn't work if it's on the edge
                if (mines[row + dRow][col + dCol]) {
                    count++;
                }
                dCol++;
            }
            dRow++;
        }
        return count;
    }

    public static void reveal(boolean[][] mines, boolean[][] revealed, int row, int col) {
        revealed[row][col] = true;
    }

}
