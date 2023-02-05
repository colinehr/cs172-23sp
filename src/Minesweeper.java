public class Minesweeper {

    public static void main(String[] args) {
        // initialization
        int numMines = 10;
        boolean[][] mines = new boolean[8][8];
        for (int i = 0; i < numMines; i++) {
            int row = StdRandom.uniformInt(8);
            int col = StdRandom.uniformInt(8);
            mines[row][col] = true;
        }
    }

}
