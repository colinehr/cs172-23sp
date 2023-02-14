import java.util.Arrays;

public class TicTacToe {

    public enum Space {
        EMPTY,
        O,
        X,
    }

    public static Space[][] initGrid() {
        Space[][] grid = new Space[3][3];
        Arrays.fill(grid, Space.EMPTY);
        return grid;
    }

    public static void main(String[] args) {
        Space[][] grid = initGrid();
    }

}
