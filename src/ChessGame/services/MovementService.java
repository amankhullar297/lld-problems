package ChessGame.services;

import ChessGame.models.Board;
import ChessGame.models.Position;
import ChessGame.models.Piece;

public interface MovementService {
    public boolean isValid(Board board, Piece piece, Position to);
    public void move(Board board, Piece piece, Position to);
}