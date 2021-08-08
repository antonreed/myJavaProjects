package school.lesson4;

public class Rectangle extends Figure {
    private int lenght;
    private int width;

    public Rectangle(int lenght, int width, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.lenght = lenght;
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }
}
