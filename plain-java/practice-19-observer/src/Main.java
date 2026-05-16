public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        Observer subscriber1 = new NewsSubscriber("Ivan");
        Observer subscriber2 = new NewsSubscriber("Maria");

        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);

        publisher.publishNews("New Java version released");

        publisher.removeObserver(subscriber1);

        System.out.println();
        publisher.publishNews("Second news message");
    }
}
