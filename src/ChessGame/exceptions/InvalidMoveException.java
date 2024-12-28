package ChessGame.exceptions;

import java.io.IOException;

public class InvalidMoveException extends IOException {
    private String message;

    public InvalidMoveException(String message){
        super(message);
        this.message = message;
    }
}
