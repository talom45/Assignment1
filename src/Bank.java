public class Bank {

     String accountType;
     Double accountBalance;

     Bank(String accountType,Double accountBalance){

         this.accountBalance= accountBalance;
         this.accountType= accountType;

     }

    public Bank() {

    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + accountBalance);
    }


}

