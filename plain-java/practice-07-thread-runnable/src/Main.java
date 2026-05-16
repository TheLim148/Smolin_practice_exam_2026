public class Main {
    public static void main(String[] args) {
        Runnable task1 = new MessagePrinter("First task", 5);
        Runnable task2 = new MessagePrinter("Second task", 5);

        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
