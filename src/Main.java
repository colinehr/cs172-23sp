public class Main {

    public static void graphComplex(int n) {
        // generate n random complex numbers
        Complex[] zs = new Complex[n];
        for (int i = 0; i < n; i++) {
            double real = StdRandom.uniformDouble(-10, 10);
            double imaginary = StdRandom.uniformDouble(-10, 10);
            zs[i] = new Complex(real, imaginary);
        }
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);
        StdDraw.line(-10, 0, 10, 0);
        StdDraw.line(0, -10, 0, 10);
        for (int i = 0; i < n; i++) {
            StdDraw.filledCircle(zs[i].real, zs[i].imaginary, 0.1);
        }
    }

    public static String carName(Car car) {
        return car.make + " " + car.model;
    }

    public static void main(String[] args) {
        Quad square = new Quad(5.0);
        square.setSide(10.0);
    }
}
