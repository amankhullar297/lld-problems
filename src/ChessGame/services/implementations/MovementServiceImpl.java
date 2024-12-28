package ChessGame.services.implementations;

import ChessGame.factories.PieceStrategyFactory;
import ChessGame.models.Board;
import ChessGame.models.Piece;
import ChessGame.models.Position;
import ChessGame.services.MovementService;
import ChessGame.strategies.PieceMovementStrategy;

import java.io.IOException;

public class MovementServiceImpl implements MovementService {
    @Override
    public boolean isValid(Board board, Piece piece, Position to) {
        PieceMovementStrategy pieceMovementStrategy = PieceStrategyFactory.getPieceStrategy(piece.getType());
        return pieceMovementStrategy.validMove(board, piece.getCurrentPosition(), to);
    }

    @Override
    public void move(Board board, Piece piece, Position to) throws IOException {
        PieceMovementStrategy pieceMovementStrategy = PieceStrategyFactory.getPieceStrategy(piece.getType());
        pieceMovementStrategy.move(board, piece, to);
    }
}
