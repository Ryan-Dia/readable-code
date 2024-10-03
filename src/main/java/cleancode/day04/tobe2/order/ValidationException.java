package cleancode.day04.tobe2.order;

public class ValidationException extends RuntimeException {
  public ValidationException(String message) {
    super(message);
  }
}
