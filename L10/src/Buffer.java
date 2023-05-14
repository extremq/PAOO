import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
    private static final int CAPACITY = 10;
    private LinkedList<Integer> buffer;
    private Lock lock;
    private Condition notEmpty;
    private Condition notFull;

    public Buffer() {
        buffer = new LinkedList<Integer>();
        lock = new ReentrantLock();
        notEmpty = lock.newCondition();
        notFull = lock.newCondition();
    }

    public void write(int number) throws InterruptedException {
        lock.lock();

        try {
            // While at full capacity, wait for not full condition
            while (buffer.size() == CAPACITY) {
                notFull.await();
            }

            buffer.offer(number);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public int read() throws InterruptedException {
        int number;
        lock.lock();

        try {
            // While at empty capacity, wait for not empty condition
            while (buffer.size() == 0) {
                notEmpty.await();
            }
            number = buffer.remove();
            notFull.signal();
        } finally {
            lock.unlock();
        }

        return number;
    }
}
