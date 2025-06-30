public class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printInfo() {
        System.out.println("Карта: " + accountNumber + ", Баланс: " + balance);
    }
}
