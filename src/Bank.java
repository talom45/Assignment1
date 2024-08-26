public class Bank {

    String accountType;
    double accountBalance;

    Bank(String accountType, double accountBalance) {
        this.accountBalance=accountBalance;
        this.accountType=accountType;//this allows explicitly of objects
    }
    public void deposit(double amount) {
        accountBalance+=amount;
        System.out.println("Deposited $"+amount+". New balance:$"+accountBalance);
    }
    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient funds!!");//using conditional statements to achieve specific goals for the code
        }
        else {
            accountBalance-=amount;
            System.out.println("You Withdrew $"+amount+" from " + accountType+ " account"+". New balance: $"+accountBalance);
        }// the code should not allow individuals to withdraw excess amounts from their actual balance.
    }
    public void display(){
        System.out.println(accountType+" "+"account");
        System.out.println("Balance: $"+accountBalance);//displaying the bank information
        }

    public void display2info(){
        System.out.println(accountType+" "+"account");
        System.out.println("Balance: $"+accountBalance);
    }
}



