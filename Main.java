public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();

        // payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy("4400-4301-5170-0942");
        PaymentStrategy paypalPayment = new PayPalPaymentStrategy("adildaniyar@paypal.com");

        // use strategy through singleton
        paymentProcessor.processPayment(creditCardPayment, 550);
        paymentProcessor.processPayment(paypalPayment, 300);
    }
}