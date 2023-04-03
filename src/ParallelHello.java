import java.util.Objects;

public class ParallelHello extends Thread {

    int id;

    public ParallelHello(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            this.longHello();
        } catch (InterruptedException e) {}
    }

    public void longHello() throws InterruptedException {
        Thread.sleep(StdRandom.uniformInt(500, 5000));
        StdOut.println("Hello! (" + this.id + ")");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new ParallelHello[10];
        // initialize thread array
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ParallelHello(i);
        }
        // start running each thread
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        // wait for each thread to complete
        for (int i = 0; i < threads.length; i++) {
            threads[i].join(3000);
        }
        StdOut.println("All done!");
    }

}
