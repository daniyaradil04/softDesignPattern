public class CreditCardPaymentStrategy implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}

