public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CardPaymentStrategy("**** **** **** 1234"));
        paymentContext.executePayment(1500);

        paymentContext.setPaymentStrategy(new CashPaymentStrategy());
        paymentContext.executePayment(800);
    }
}
