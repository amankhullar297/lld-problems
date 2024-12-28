package ChessGame.exceptions;

import java.io.IOException;

public class InvalidPlayerException extends IOException {
    private String message;

    public InvalidPlayerException(String message){
        super(message);
        this.message = message;
    }
}
