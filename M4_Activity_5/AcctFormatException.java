package ph.com.bpi.hello;

public class AcctFormatException extends RuntimeException {
    AcctFormatException(String message) {
        super(message);
    }
}