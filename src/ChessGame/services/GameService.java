package ChessGame.services;

import ChessGame.models.Game;
import ChessGame.models.Player;

public interface GameService {
    public Game startNewGame(Player player1, Player player2);
}
