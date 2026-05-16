public class MessagePrinter implements Runnable {
    private final String message;
    private final int count;

    public MessagePrinter(String message, int count) {
        this.message = message;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted");
                return;
            }
        }
    }
}
