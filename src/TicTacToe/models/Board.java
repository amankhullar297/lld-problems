package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    Board(int rows, int columns) {
        board = new ArrayList<>();
        for (int i = 0; i < rows; ++i) {
            board.add(new ArrayList<>());
            for (int j = 0; j < columns; ++j) {
                board.get(i).add(new Cell());
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.size(); ++i) {
            for (int j = 0; j < board.get(i). size(); ++j) {
                System.out.printf("%c ", board.get(i).get(j).symbol.getSymbol());
            }
        }
        System.out.printf("\n");
    }
}
