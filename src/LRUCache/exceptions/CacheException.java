package LRUCache.exceptions;

import java.io.IOException;

public abstract class CacheException extends IOException {
    public CacheException(String message){
        super(message);
    }
}
