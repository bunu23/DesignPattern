package strategypattern.service;

public class MobileWalletPayment implements PaymentStrategy {
    private String mobileNumber;

    public MobileWalletPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Mobile Wallet: " + mobileNumber);
    }
}