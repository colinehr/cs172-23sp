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
        // graph each of them using a scatter plot
        for (int i = 0; i < n; i++) {
            // ...
        }
    }

    public static String carName(Car car) {
        return car.make + " " + car.model;
    }

    public static void main(String[] args) {
//        Complex z = new Complex();
//        z.real = 1.0;
//        z.imaginary = -2.0;

        Complex z = createComplex(1.0, -2.0);
        Complex w = createComplex(3, 4);
        printComplex(addComplex(z, w));

//        Car subaru = new Car();
//        subaru.make = "Subaru";
//        subaru.model = "Outback";
//        subaru.year = 2002;
//        subaru.mileage = 200000;
//        subaru.condition = "Rugged";
//        StdOut.println(carName(subaru));
//
//        Car toyota = new Car();
//        toyota.make = "Toyota";
//        toyota.model = "Prius";
//        toyota.year = 2012;
//        toyota.mileage = 80000;
//        toyota.condition = "Fine";
    }
}
