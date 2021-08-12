package school.lesson6;

public class MyArrayDataException extends RuntimeException {
    private String message = "Не удалось преобразовать String в Integer";
    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String getMessage() {
        return message + " в ячейке [" + i + "][" + j + "].";
    }
}
