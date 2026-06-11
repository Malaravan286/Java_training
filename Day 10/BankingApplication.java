class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void showAccountType() {
        System.out.println("General bank account");
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void showAccountType() {
        System.out.println(getAccountHolder() + " has a savings account. Balance: Rs." + getBalance());
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void showAccountType() {
        System.out.println(getAccountHolder() + " has a current account. Balance: Rs." + getBalance());
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("Arun", 10000),
            new CurrentAccount("Divya", 50000)
        };

        for (BankAccount account : accounts) {
            account.deposit(1000);
            account.showAccountType();
        }
    }
}
