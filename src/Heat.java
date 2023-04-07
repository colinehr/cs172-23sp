import java.awt.Color;
import java.util.concurrent.*;

public class Heat extends Thread {

    static double minT = 0.0;
    static double maxT = 100.0;

    static double[][] t;
    static double[][] t1;

    static CyclicBarrier barrier;

    int from;
    int to;

    public Heat(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public void run() {
        while (true) {
            step(t, t1);
            myBarrier();
            if (from == 1) draw(t1);
            step(t1, t);
            myBarrier();
            if (from == 1) draw(t);
        }
    }

    public void myBarrier() {
        try {
            barrier.await();
        } catch (InterruptedException ex) {
            return;
        } catch (BrokenBarrierException ex) {
            return;
        }
    }

    public static void main(String[] unused) {
        int n = 100;
        t = new double[n][n];
        t1 = new double[n][n];

        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(-.5, (double)n - 0.5);
        init(t);
        copy(t, t1);

        int parties = 4;
        Heat[] threads = new Heat[parties];
        barrier = new CyclicBarrier(parties);
        int delta = n/parties;
        for (int i = 0, from = 1; i < parties; ++i) {
            threads[i] = new Heat(from, Math.min(from + delta, n - 1));
            from += delta;
        }
        for (int i = 0; i < parties; ++i) {
            threads[i].start();
        }
    }

    private void step(double[][] cur, double[][] nxt) {
        int n = cur.length;
        for (int x = from; x < to; ++x)
            for (int y = 1; y < n - 1; ++y)
                nxt[x][y] = stencil(cur, x, y);
    }

    private static double stencil(double[][] t, int x, int y) {
        return 0.25*(t[x - 1][y] + t[x + 1][y] + t[x][y - 1] + t[x][y + 1]);
    }

    private static void draw(double[][] t) {
        StdDraw.clear();
        int n = t.length;
        for (int x = 0; x < n; ++x)
            for (int y = 0; y < n; ++y)
                draw(t, x, y);
        StdDraw.show();
    }

    private static void draw(double[][] t, int x, int y) {
        StdDraw.setPenColor(c(t, x, y));
        StdDraw.filledSquare(x, y, 0.5);
    }

    private static Color c(double[][] t, int x, int y) {
        double ratio = (t[x][y] - minT)/(maxT - minT);
        int red = (int)Math.round(ratio*255);
        int blue = (int)Math.round((1. - ratio)*255);
        return new Color(red, 0, blue);
    }

    private static void init(double[][] t) {
        int n = t.length;
        for (int i = 0; i < n; ++i) {
            t[0][i] = t[i][0] = t[i][n - 1] = minT;
        }
        for (int i = 0; i < n; ++i) {
            t[n - 1][i] = maxT;
        }
        for (int x = 1; x < n - 1; ++x)
            for (int y = 1; y < n - 1; ++y)
                //t[x][y] = (minT + maxT)/2.;
                t[x][y] = minT;
    }

    private static void copy(double[][] from, double[][] to) {
        int n = from.length;
        for (int x = 0; x < n; ++x)
            for (int y = 0; y < n; ++y)
                to[x][y] = from[x][y];
    }

}