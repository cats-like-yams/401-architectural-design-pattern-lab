package StrategyPattern;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(29.99);
        cart.addItem(49.99);

        //pay with credit card
        cart.setPaymentStrategy(new CreditCardStrategy("John Doe", "1234567890123456", "123", "2026"));
        cart.checkout();
        //pay with paypal
        cart.setPaymentStrategy(new PayPalStrategy("johndoe@example.com", "password"));
        cart.checkout();
        //pay with crypto
        cart.setPaymentStrategy(new CryptoStrategy("0xABCDEF"));
        cart.checkout();
    }
}
