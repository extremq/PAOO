import java.util.concurrent.ArrayBlockingQueue;

public class ConsumerTaskV2 implements Runnable {
    private ArrayBlockingQueue<Integer> buffer;

    public ConsumerTaskV2(ArrayBlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int number = buffer.take();
                System.out.println("Consumer reads " + number);
                Thread.sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
