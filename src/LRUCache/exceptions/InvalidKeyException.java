package LRUCache.exceptions;

public class InvalidKeyException extends CacheException{
    public InvalidKeyException(String message){
        super(message);
    }
}
