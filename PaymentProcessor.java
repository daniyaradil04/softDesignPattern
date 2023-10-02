public class PaymentProcessor {
    private static PaymentProcessor instance;

    private PaymentProcessor() {
    }

    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void processPayment(PaymentStrategy paymentStrategy, int amount) {
        paymentStrategy.pay(amount);
    }
}
