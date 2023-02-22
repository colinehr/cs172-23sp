public class Recursion {

    public static void curve(double x0, double y0,
                             double x1, double y1,
                             double var, double hurst) {
        // set the decay
        double s = Math.pow(2, 2 * hurst);
        // draw a line if the two points are close
        if (x1 - x0 < 0.01) {
            StdDraw.line(x0, y0, x1, y1);
            return;
        }
        // otherwise, break the line into two parts at the midpoint,
        // and randomly shift the elevation of the midpoint
        double xm = (x0 + x1) / 2;
        double ym = (y0 + y1) / 2;
        double delta = StdRandom.gaussian(0, Math.sqrt(var));
        curve(x0, y0, xm, ym + delta, var/s, hurst);
        curve(xm, ym + delta, x1, y1, var/s, hurst);
    }

    public static void main(String[] args) {
        while (true) {
            // draw a curve
            curve(0, 0.5, 1.0, 0.5, 0.01, 1);
            // wait 3 seconds and reset
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            StdDraw.clear();
        }

    }

}
