package africa.semicolon.marketPlace.exceptions;

public class DuplicateEmailException extends MarketPlaceException {
    public DuplicateEmailException(String message) {
        super(message);
    }
}
