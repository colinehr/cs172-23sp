import java.awt.Color;

public class Gradient {

    private Color[] colors;

    public Gradient(Color start, Color end) {
        this.colors = new Color[] {start, end};
    }

    public Gradient(Color[] colors) {
        this.colors = colors;
    }

    private Color getColor(Color a, Color b, double t) {
        int red = (int) ((1 - t) * a.getRed() + t * b.getRed());
        int green = (int) ((1 - t) * a.getGreen() + t * b.getGreen());
        int blue = (int) ((1 - t) * a.getBlue() + t * b.getBlue());
        return new Color(red, green, blue);
    }

    public Color getColor(double t) {
        if (t == 1) {
            return this.colors[this.colors.length - 1];
        }
        t *= colors.length - 1;
        return getColor(colors[(int) t], colors[(int) t + 1], t - (int) t);
    }

    public static void main(String[] args) {
        int n = 20;
        StdDraw.setXscale(-0.5, n + 0.5);
        StdDraw.setYscale(-0.5, 0.5);
        Gradient gradient = new Gradient(new Color[] { Color.WHITE, Color.ORANGE, Color.BLUE });
        for (int i = 0; i <= n; i++) {
            StdDraw.setPenColor(gradient.getColor(i / (double) n));
            StdDraw.filledSquare(i, 0, 0.5);
        }
    }

}
