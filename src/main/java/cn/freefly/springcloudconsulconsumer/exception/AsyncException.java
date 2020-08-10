package cn.freefly.springcloudconsulconsumer.exception;

public class AsyncException extends RuntimeException{
    public AsyncException(String message) {
        super(message);
    }

    public AsyncException(String message, Throwable cause) {
        super(message, cause);
    }
}
