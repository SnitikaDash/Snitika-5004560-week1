package strategy;

public class CreditCardPayment implements PaymentStrategy {
	private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card: " + cardNumber);
    }

}
