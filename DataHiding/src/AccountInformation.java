import java.util.Scanner;

public class AccountInformation {
    // Private fields (Data Hiding)
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private int pin; // Security PIN for validation

    // Constructor
    public AccountInformation(String accountNumber, String accountHolderName, double balance, String accountType, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.pin = pin;
    }

    // Getter Methods (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    // Setter Methods (Encapsulation)
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money with PIN validation
    public boolean withdraw(double amount, int enteredPin) {
        if (this.pin != enteredPin) {
            System.out.println("Incorrect PIN! Withdrawal failed.");
            return false;
        }

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount!");
            return false;
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an Account Object with a PIN
        AccountInformation account = new AccountInformation("123456789", "John Doe", 1000.0, "Savings", 1234);

        // Display Initial Account Info
        account.displayAccountInfo();

        // Deposit money
        account.deposit(500);

        // Withdraw money with PIN validation
        System.out.print("\nEnter PIN to withdraw: ");
        int enteredPin = scanner.nextInt();

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        account.withdraw(amount, enteredPin);

        // Display Final Account Info
        System.out.println("\nUpdated Account Information:");
        account.displayAccountInfo();

        scanner.close();
    }
}
