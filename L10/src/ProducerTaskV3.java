import java.util.HashSet;
import java.util.Set;

public class ProducerTaskV3 implements Runnable{
    private Set<Integer> buffer;
    public ProducerTaskV3(Set<Integer> buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            while (true) {
                int number = (int) (Math.random() * 100);
                synchronized (buffer) {
                    buffer.add(number);
                }
                System.out.println("Producer writes " + number);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
