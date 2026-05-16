public class CardPaymentStrategy implements PaymentStrategy {
    private final String cardNumber;

    public CardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by card " + cardNumber);
    }
}
