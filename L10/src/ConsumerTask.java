public class ConsumerTask implements Runnable {
    private Buffer buffer;

    public ConsumerTask(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int number = buffer.read();
                System.out.println("Consumer reads " + number);
                Thread.sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
