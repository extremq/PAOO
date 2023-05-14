import java.util.concurrent.ArrayBlockingQueue;

public class ProducerTaskV2 implements Runnable{
    private ArrayBlockingQueue<Integer> buffer;

    public ProducerTaskV2(ArrayBlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int number = (int) (Math.random() * 100);
                buffer.put(number);
                System.out.println("Producer writes " + number);
                Thread.sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
