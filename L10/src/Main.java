import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        //   PROBLEMA 1
//        Buffer buffer = new Buffer();
//        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(2);
//        executor.execute(new ProducerTask(buffer));
//        executor.execute(new ConsumerTask(buffer));
//        executor.shutdown();

        // problema 2
//        ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(10);
//        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(2);
//        executor.execute(new ProducerTaskV2(buffer));
//        executor.execute(new ConsumerTaskV2(buffer));
//        executor.shutdown();

        // problema 3
        HashSet<Integer> buffer = new HashSet<>();
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(2);
        executor.execute(new ProducerTaskV3(buffer));
        executor.execute(new ConsumerTaskV3(buffer));
        executor.shutdown();
    }
}