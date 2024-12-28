package ChessGame.services;

import ChessGame.exceptions.InvalidMoveException;
import ChessGame.models.*;

import java.io.IOException;

public interface GameService {
    public Game startNewGame(Player player1, Player player2);
    public void move(Game game, Player player, Piece piece, Position to) throws IOException;
    public Player nextTurn(Game game);
}
