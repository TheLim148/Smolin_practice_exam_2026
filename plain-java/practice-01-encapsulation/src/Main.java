public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + calculator.divide(10, 5));

        BankAccount account = new BankAccount("Ivan Ivanov", 1000);

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}
