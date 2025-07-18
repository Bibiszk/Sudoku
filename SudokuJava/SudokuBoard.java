public class SudokuBoard {
    private int[][] board;
    private boolean[][] fixedCells;

    public SudokuBoard() {
        board = new int[9][9];
        fixedCells = new boolean[9][9];
        initBoard();
    }

    private void initBoard() {
        int[][] initial = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = initial[i][j];
                if (initial[i][j] != 0) {
                    fixedCells[i][j] = true;
                }
            }
        }
    }

    public void printBoard() {
        System.out.println("    1 2 3   4 5 6   7 8 9");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("  +-------+-------+-------+");
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] == 0 ? "  " : board[i][j] + " ");
                if ((j + 1) % 3 == 0) System.out.print("| ");
            }
            System.out.println();
        }
        System.out.println("  +-------+-------+-------+");
    }

    public boolean isFixed(int row, int col) {
        return fixedCells[row][col];
    }

    public boolean isValidMove(int row, int col, int value) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value || board[i][col] == value)
                return false;
        }

        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == value)
                    return false;
            }
        }

        return true;
    }

    public void setValue(int row, int col, int value) {
        board[row][col] = value;
    }

    public boolean isComplete() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] == 0)
                    return false;
        return true;
    }
}
