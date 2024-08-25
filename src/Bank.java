public class Bank {

    String accountType;
    Double accountBalance;

    Bank(String accountType, Double accountBalance) {

        this.accountBalance = accountBalance;
        this.accountType = accountType;

    }

    public Bank() {

    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + accountBalance);
    }

    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient funds!!");
        } else {
            accountBalance -= amount;
            System.out.println("You Withdrew $" + amount + " from "+accountType+" account"+". New balance: $" + accountBalance);
        }


    }

}

