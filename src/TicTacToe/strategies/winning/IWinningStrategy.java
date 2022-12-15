package TicTacToe.strategies.winning;

import TicTacToe.models.Board;
import TicTacToe.models.Player;
import java.util.List;

public interface IWinningStrategy {
    Player checkWinner(Board board, List<Player> players) ;
}