public class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        // should print something like "1.0 + 2.0i"
        if (this.imaginary < 0) {
            StdOut.println(this.real + " - " + (-this.imaginary) + "i");
        } else {
            StdOut.println(this.real + " + " + this.imaginary + "i");
        }
    }

    public Complex add(Complex w) {
        return new Complex(this.real + w.real, this.imaginary + w.imaginary);
    }
}
