public class Minesweeper {

    public static boolean[][] initMines() {
        int numMines = 10;
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
        boolean[][] mines = initMines();
    }

}
