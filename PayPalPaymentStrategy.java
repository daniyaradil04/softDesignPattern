public class PayPalPaymentStrategy implements PaymentStrategy{
    private String email;

    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal account " + email);
    }
}
