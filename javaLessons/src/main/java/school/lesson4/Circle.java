package school.lesson4;

public class Circle extends Figure {
    private double diameter;

    public Circle(double diameter, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }
}
