package ChessGame.services;

import ChessGame.exceptions.InvalidMoveException;
import ChessGame.models.*;

public interface GameService {
    public Game startNewGame(Player player1, Player player2);
    public void move(Game game, Player player, Piece piece, Position to) throws InvalidMoveException;
    public Player nextTurn(Game game);
}
