package strategypattern.context;

import strategypattern.service.PaymentStrategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set!");
        }
        paymentStrategy.pay(amount);
    }
}