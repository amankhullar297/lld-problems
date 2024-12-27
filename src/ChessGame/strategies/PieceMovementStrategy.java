package ChessGame.strategies;

import ChessGame.models.Board;
import ChessGame.models.Piece;
import ChessGame.models.Position;

public interface PieceMovementStrategy {
    public boolean validMove(Board board, Piece piece, Position to);
    public void move(Board board, Piece piece, Position to);
}
