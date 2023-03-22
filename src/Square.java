public class Square {

    double x;
    double y;
    double side;

    public Square(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public void draw() {
        StdDraw.square(this.x, this.y, this.side / 2);
    }

    public static void main(String[] args) {
        Square sq = new Square(2, -2, 5);
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);
        sq.draw();
    }

}
