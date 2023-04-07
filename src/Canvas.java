public class Canvas {

    Shape[] shapes;
    int numShapes;

    public Canvas() {
        this.shapes = new Shape[10];
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);
    }

    public void add(Shape shape) {
        this.shapes[numShapes] = shape;
        numShapes++;
    }

    public void draw() {
        for (int i = 0; i < numShapes; i++) {
            shapes[i].draw();
        }
    }

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.add(new Quad(0, 0, 2));
        canvas.add(new Quad(1, 1, 2));
        canvas.add(new Circle(0, 0, 4));
        canvas.draw();
    }

}
