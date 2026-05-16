public class BankAccount {
    private final String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name cannot be empty");
        }

        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Not enough money on balance");
        }

        balance -= amount;
    }
}
