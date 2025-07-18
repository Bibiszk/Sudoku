import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;
    private Scanner scanner;

    public SudokuGame() {
        board = new SudokuBoard();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("🎮 Bem-vindo ao Sudoku Terminal Game!");

        while (!board.isComplete()) {
            board.printBoard();

            System.out.print("Linha (1-9): ");
            int row = scanner.nextInt() - 1;

            System.out.print("Coluna (1-9): ");
            int col = scanner.nextInt() - 1;

            if (row < 0 || row > 8 || col < 0 || col > 8) {
                System.out.println("❌ Posição inválida!");
                continue;
            }

            if (board.isFixed(row, col)) {
                System.out.println("🔒 Célula bloqueada!");
                continue;
            }

            System.out.print("Digite o valor (1-9): ");
            int value = scanner.nextInt();

            if (value < 1 || value > 9) {
                System.out.println("❌ Valor inválido!");
                continue;
            }

            if (board.isValidMove(row, col, value)) {
                board.setValue(row, col, value);
            } else {
                System.out.println("❌ Movimento inválido!");
            }
        }

        board.printBoard();
        System.out.println("🎉 Parabéns, você completou o Sudoku! 🎉");
    }
}