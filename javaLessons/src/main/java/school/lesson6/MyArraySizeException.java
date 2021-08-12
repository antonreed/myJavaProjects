package school.lesson6;

public class MyArraySizeException extends RuntimeException {
    private String message = "Неверный размер массива.";

    @Override
    public String getMessage() {
        return message;
    }
}
