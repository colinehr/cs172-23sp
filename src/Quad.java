import java.util.Objects;

public class Quad {

    private double side;
    private double area;

    public Quad() {}

    public Quad(double length) {
        this.side = length;
        this.area = length * length;
    }

    /** Returns the length of the sides of the Quad
     * @return The length of the side of the Quad
     */
    public double getSide() {
        return side;
    }

    /** Sets the value of the sides of the Quad
     * @param side The length of the side
     */
    public void setSide(double side) {
        this.side = side;
        this.area = side * side;
    }

    /** Returns the area of the Quad
     * @return The area of the Quad
     */
    public double area() {
        return this.area;
    }

    public double perimeter() {
        return 4 * this.side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return Double.compare(quad.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    public String toString() {
        return "Quad with side length " + this.side;
    }

    public static void main(String[] args) {
        Quad square = new Quad();
        StdOut.println(square.toString());
    }

}
