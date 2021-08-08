package school.lesson4;

public class Figure implements GeometricFigure {
    private String fillColor;
    private String borderColor;
    private double perimeter;
    private double square;

    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public void calculateSquare(Figure figure) {
        if (figure instanceof Rectangle rectangle) {
            square = rectangle.getLenght() * rectangle.getWidth();
        }
        if (figure instanceof Circle circle) {
            square = Math.pow(circle.getDiameter(), 2) / 4 * PI;
        }
        if (figure instanceof Triangle triangle) {
            double sP = perimeter / 2;
            square = Math.sqrt(sP * (sP - triangle.getA()) * (sP - triangle.getB()) * (sP - triangle.getC()));
        }
    }

    public void info(Figure figure) {
        calculatePerimeter(figure);
        calculateSquare(figure);
        System.out.println("Периметр = " + perimeter +
                ", площадь = " + square +
                ", цвет заливки: " + fillColor +
                ", цвет границы: " + borderColor
        );
    }
}
