package ChessGame.services.implementations;

import ChessGame.models.*;
import ChessGame.services.GameService;
import ChessGame.services.MovementService;

public class GameServiceImpl implements GameService {
    private final MovementService movementService;

    GameServiceImpl(MovementService movementService){
        this.movementService = movementService;
    }


    @Override
    public Game startNewGame(Player player1, Player player2) {
        Game game = new Game(player1, player2);
        initializeBoard(game);
        return game;
    }

    @Override
    public void move(Game game, Player player, Piece piece, Position to) {
        movementService.move(game.getBoard(), piece, to);
    }

    private void initializeBoard(Game game){
        Piece[][] pieces = game.getBoard().getPieces();
        pieces[1][0] = new Piece(PieceType.PAWN, PieceColour.BLACK, new Position(1, 0));
        pieces[1][1] = new Piece(PieceType.PAWN, PieceColour.BLACK, new Position(1, 1));
        pieces[1][2] = new Piece(PieceType.PAWN, PieceColour.BLACK, new Position(1, 2));
        pieces[1][3] = new Piece(PieceType.PAWN, PieceColour.BLACK, new Position(1, 3));
        pieces[1][4] = new Piece(PieceType.PAWN, PieceColour.BLACK, new Position(1, 4));
        pieces[1][5] = new Piece(PieceType.PAWN, PieceColour.BLACK, new Position(1, 5));
        pieces[1][6] = new Piece(PieceType.PAWN, PieceColour.BLACK, new Position(1, 6));
        pieces[1][7] = new Piece(PieceType.PAWN, PieceColour.BLACK, new Position(1, 7));

        pieces[6][0] = new Piece(PieceType.PAWN, PieceColour.WHITE, new Position(6, 0));
        pieces[6][1] = new Piece(PieceType.PAWN, PieceColour.WHITE, new Position(6, 1));
        pieces[6][2] = new Piece(PieceType.PAWN, PieceColour.WHITE, new Position(6, 2));
        pieces[6][3] = new Piece(PieceType.PAWN, PieceColour.WHITE, new Position(6, 3));
        pieces[6][4] = new Piece(PieceType.PAWN, PieceColour.WHITE, new Position(6, 4));
        pieces[6][5] = new Piece(PieceType.PAWN, PieceColour.WHITE, new Position(6, 5));
        pieces[6][6] = new Piece(PieceType.PAWN, PieceColour.WHITE, new Position(6, 6));
        pieces[6][7] = new Piece(PieceType.PAWN, PieceColour.WHITE, new Position(6, 7));

        pieces[0][0] = new Piece(PieceType.ROOK, PieceColour.BLACK, new Position(0, 0));
        pieces[0][1] = new Piece(PieceType.KNIGHT, PieceColour.BLACK, new Position(0, 1));
        pieces[0][2] = new Piece(PieceType.BISHOP, PieceColour.BLACK, new Position(0, 2));
        pieces[0][3] = new Piece(PieceType.KING, PieceColour.BLACK, new Position(0, 3));
        pieces[0][4] = new Piece(PieceType.QUEEN, PieceColour.BLACK, new Position(0, 4));
        pieces[0][5] = new Piece(PieceType.BISHOP, PieceColour.BLACK, new Position(0, 5));
        pieces[0][6] = new Piece(PieceType.KNIGHT, PieceColour.BLACK, new Position(0, 6));
        pieces[0][7] = new Piece(PieceType.ROOK, PieceColour.BLACK, new Position(0, 7));

        pieces[7][0] = new Piece(PieceType.ROOK, PieceColour.WHITE, new Position(7, 0));
        pieces[7][1] = new Piece(PieceType.KNIGHT, PieceColour.WHITE, new Position(7, 1));
        pieces[7][2] = new Piece(PieceType.BISHOP, PieceColour.WHITE, new Position(7, 2));
        pieces[7][3] = new Piece(PieceType.KING, PieceColour.WHITE, new Position(7, 3));
        pieces[7][4] = new Piece(PieceType.QUEEN, PieceColour.WHITE, new Position(7, 4));
        pieces[7][5] = new Piece(PieceType.BISHOP, PieceColour.WHITE, new Position(7, 5));
        pieces[7][6] = new Piece(PieceType.KNIGHT, PieceColour.WHITE, new Position(7, 6));
        pieces[7][7] = new Piece(PieceType.ROOK, PieceColour.WHITE, new Position(7, 7));

    }
}
