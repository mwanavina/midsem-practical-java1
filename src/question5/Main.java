package question5;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1007410488", "Mark Mwanavina", 100000, "Savings");
        account1.displayBalance();
        account1.deposit(500);
        account1.withdraw(200);
        account1.applyInterest();
        account1.withdraw(500000); // show error because the amount is bigger than the balance
        account1.deposit(-1000000); // show error because it contains a negative value
    }
}

