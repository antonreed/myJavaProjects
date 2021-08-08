package school.lesson4;

public interface GeometricFigure {
    double PI = 3.14;

    default void calculatePerimeter(Figure figure) {
        if (figure instanceof Rectangle rectangle) {
            figure.setPerimeter((rectangle.getLenght() + rectangle.getWidth()) * 2);
        }
        if (figure instanceof Circle circle) {
            figure.setPerimeter(circle.getDiameter() * PI);
        }
        if (figure instanceof Triangle triangle) {
            figure.setPerimeter(triangle.getA() + triangle.getB() + triangle.getC());
        }
    }

    void calculateSquare(Figure figure);
}