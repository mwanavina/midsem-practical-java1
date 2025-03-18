package question5;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialDeposit, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountType = accountType;

        if (initialDeposit < 0) {
            System.out.println("Error: Initial deposit cannot be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = initialDeposit;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You Have Deposited: " + amount + " | New Balance is: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be greater than zero.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("You Have Withdrawn: " + amount + " | New Balance is: " + balance);
            } else {
                System.out.println("Error: Insufficient funds. Withdrawal denied!!!!.");
            }
        } else {
            System.out.println("Error: Withdrawal amount must be greater than zero. Please try again");
        }
    }

    // Display balance method
    public void displayBalance() {
        System.out.println("Account Balance is: " + balance);
    }

    // Apply interest method
    public void applyInterest() {
        // if you try to replace the savings with fixed or any other account type other than
        // saving you will the error message "Interest applies only to Savings accounts!!!." in the terminal
        if (accountType.equalsIgnoreCase("Savings")) {
            double interest = balance * 0.05;
            balance += interest;
            System.out.println("Interest applied: " + interest + " | New Balance is: " + balance);
        } else {
            System.out.println("Interest applies only to Savings accounts!!!.");
        }
    }
// just created but I haven't used them
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }
}

