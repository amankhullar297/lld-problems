package ChessGame.factories;

import ChessGame.models.PieceType;
import ChessGame.strategies.PieceMovementStrategy;

import java.util.HashMap;

public class PieceStrategyFactory {
    private static HashMap<PieceType, PieceMovementStrategy> PIECE_STRATEGIES = new HashMap<>();

    public static PieceMovementStrategy getPieceStrategy(PieceType pieceType){
        if(PIECE_STRATEGIES.containsKey(pieceType))
            return PIECE_STRATEGIES.get(pieceType);
        else {
            return null;
        }
    }
}
