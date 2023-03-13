public class Main {

    public static Complex createComplex(double real, double imaginary) {
        Complex z = new Complex();
        z.real = real;
        z.imaginary = imaginary;
        return z;
    }

    public static void printComplex(Complex z) {
        // should print something like "1.0 + 2.0i"
        if (z.imaginary < 0) {
            StdOut.println(z.real + " - " + (-z.imaginary) + "i");
        } else {
            StdOut.println(z.real + " + " + z.imaginary + "i");
        }
    }

    public static Complex addComplex(Complex z, Complex w) {
//        double real = z.real + w.real;
//        double imaginary = z.imaginary + w.imaginary;
//        return createComplex(real, imaginary);
        return createComplex(z.real + w.real, z.imaginary + w.imaginary);
    }

    public static void graphComplex(int n) {
        // generate n random complex numbers
        Complex[] zs = new Complex[n];
        for (int i = 0; i < n; i++) {
            double real = StdRandom.uniformDouble(-10, 10);
            double imaginary = StdRandom.uniformDouble(-10, 10);
            zs[i] = createComplex(real, imaginary);
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
        graphComplex(100);
    }
}
