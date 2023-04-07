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
    }

    public static String carName(Car car) {
        return car.make + " " + car.model;
    }

}
