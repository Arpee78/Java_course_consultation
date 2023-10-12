package week12.day2;

public class CannotFindTeacherException extends RuntimeException{
    public CannotFindTeacherException() {
    }

    public CannotFindTeacherException(String message) {
        super(message);
    }

    public CannotFindTeacherException(String message, Throwable cause) {
        super(message, cause);
    }
}
