package school.lesson4;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
