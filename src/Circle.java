public class Circle implements Shape {
    private final double x;
    private final double y;
    private final double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void draw() {
        StdDraw.circle(x, y, radius);
    }
}
