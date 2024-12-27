package ChessGame.models;

public class Piece {
    private PieceType type;
    private Position currentPosition;
    private PieceColour colour;

    public Piece(PieceType pieceType, PieceColour pieceColour, Position currentPosition){
        this.type = pieceType;
        this.colour = pieceColour;
        this.currentPosition = currentPosition;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public PieceColour getColour() {
        return colour;
    }

    public void setColour(PieceColour colour) {
        this.colour = colour;
    }
}