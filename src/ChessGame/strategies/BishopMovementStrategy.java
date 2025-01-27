package ChessGame.strategies;

import ChessGame.exceptions.InvalidMoveException;
import ChessGame.models.Board;
import ChessGame.models.Piece;
import ChessGame.models.Position;

import java.io.IOException;

public class BishopMovementStrategy implements PieceMovementStrategy{

    @Override
    public boolean validMove(Board board, Position from, Position to) {
        int rowDiff = Math.abs(to.getRow() - from.getRow());
        int colDiff = Math.abs(to.getColumn() - from.getColumn());

        return rowDiff == colDiff;
    }

    @Override
    public void move(Board board, Piece piece, Position to) throws IOException {
        if(validMove(board, piece.getCurrentPosition(), to)) {
            board.getPieces()[piece.getCurrentPosition().getRow()][piece.getCurrentPosition().getColumn()] = null;
            piece.setCurrentPosition(to);
            board.getPieces()[to.getRow()][to.getColumn()] = piece;
        }else
            throw new InvalidMoveException("Move is invalid");
    }
}
