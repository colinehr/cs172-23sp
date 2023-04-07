/******************************************************************************
 *  Compilation:  javac Mandelbrot.java
 *  Execution:    java Mandelbrot xc yc size
 *  Dependencies: StdDraw.java
 *
 *  Plots the size-by-size region of the Mandelbrot set, centered on (xc, yc)
 *
 *  % java Mandelbrot -0.5 0 2
 *
 ******************************************************************************/

import java.awt.Color;

public class ParallelMandelbrot extends Thread {

    static Picture picture;
    int n;

    @Override
    public void run() {

    }

    // return number of iterations to check if c = a + ib is in Mandelbrot set
    public static int mand(Complex z0, int max) {
        Complex z = z0;
        for (int t = 0; t < max; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return max;
    }

    public static void main(String[] args)  {
        double xc   = Double.parseDouble(args[0]);
        double yc   = Double.parseDouble(args[1]);
        double size = Double.parseDouble(args[2]);

        int n   = 1024;   // create n-by-n image
        int max = 1000;   // maximum number of iterations

        Stopwatch stopwatch = new Stopwatch();
        Picture picture = new Picture(n, n);
        Gradient gradient = new Gradient(new Color[] {new Color(0, 0, 127), Color.WHITE, Color.YELLOW, Color.ORANGE, Color.RED, Color.BLACK});
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double x0 = xc - size/2 + size*i/n;
                double y0 = yc - size/2 + size*j/n;
                Complex z0 = new Complex(x0, y0);
                Color color = gradient.getColor(mand(z0, max) / (double) max);
                picture.set(i, n-1-j, color);
            }
        }
        StdOut.println(stopwatch.elapsedTime());
        picture.show();
    }
}
