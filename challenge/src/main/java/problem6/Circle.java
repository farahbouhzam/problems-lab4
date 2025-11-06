package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle (radius %.1f cm)", radius);
    }
}
