public class ProducerTask implements Runnable {
    private Buffer buffer;

    public ProducerTask(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int number = (int) (Math.random() * 100);
                buffer.write(number);
                System.out.println("Producer writes " + number);
                Thread.sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
