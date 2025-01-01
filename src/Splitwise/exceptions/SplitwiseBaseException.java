package Splitwise.exceptions;

import java.io.IOException;

public abstract class SplitwiseBaseException extends IOException {
    public SplitwiseBaseException(String message) {
        super(message);
    }
}
