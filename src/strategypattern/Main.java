package strategypattern;

import strategypattern.context.ShoppingCart;
import strategypattern.service.CashPayment;
import strategypattern.service.CreditCardPayment;
import strategypattern.service.MobileWalletPayment;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();


        cart.setPaymentStrategy(new CreditCardPayment("1234"));
        cart.checkout(150);


        cart.setPaymentStrategy(new MobileWalletPayment("98760"));
        cart.checkout(300);


        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(50);
    }
}