import java.util.Objects;

public class Quad implements Shape {

    private final double x;
    private final double y;
    private final double side;

    public Quad(double x, double y, double length) {
        this.x = x;
        this.y = y;
        this.side = length;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Returns the length of the sides of the Quad
     * @return The length of the side of the Quad
     */
    public double getSide() {
        return side;
    }

    public void draw() {
        StdDraw.square(x, y, side / 2);
    }

    /**
     * Returns the area of the Quad
     * @return the area of the Quad
     */
    public double area() {
        return this.side * this.side;
    }

    /**
     * Returns the perimeter of the Quad
     * @return the perimeter of the Quad
     */
    public double perimeter() {
        return 4 * this.side;
    }

    @Override
    public boolean equals(Object o) {
        // this method is generated by IntelliJ!
        // right-click -> Generate... -> equals() and hashCode()
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return Double.compare(quad.side, side) == 0;
    }

    @Override
    public int hashCode() {
        // this method is generated by IntelliJ!
        // right-click -> Generate... -> equals() and hashCode()
        return Objects.hash(side);
    }

    public String toString() {
        return "Quad with side length " + this.side;
    }

    public static void main(String[] args) {
    }

}