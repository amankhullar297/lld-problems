package ChessGame.strategies;

import ChessGame.models.Board;
import ChessGame.models.Piece;
import ChessGame.models.Position;

public class BishopMovementStrategy implements PieceMovementStrategy{

    @Override
    public boolean validMove(Board board, Piece piece, Position to) {
        int rowDiff = Math.abs(to.getRow() - piece.getCurrentPosition().getRow());
        int colDiff = Math.abs(to.getColumn() - piece.getCurrentPosition().getColumn());

        return rowDiff == colDiff;
    }

    @Override
    public void move(Board board, Piece piece, Position to) {
        if(validMove(board, piece, to)) {
            board.getPieces()[piece.getCurrentPosition().getRow()][piece.getCurrentPosition().getColumn()] = null;
            piece.setCurrentPosition(to);
            board.getPieces()[to.getRow()][to.getColumn()] = piece;
        }
    }
}
