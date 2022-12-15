package TicTacToe.strategies.automove;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface IAutomaticMoveStrategy {

    Move makeMove(Board board);
}