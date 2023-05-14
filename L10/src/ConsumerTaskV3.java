import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConsumerTaskV3 implements Runnable {
    private Set<Integer> buffer;

    public ConsumerTaskV3(Set<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            synchronized (buffer) {
                // Iterate though the HashSet and print all the numbers
                Iterator<Integer> it = buffer.iterator();
                // Check if iterator has next element
                while (it.hasNext()) {
                    Thread.sleep(100);
                    // Print the element and move to next
                    System.out.println("Consumer reads " + it.next());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
