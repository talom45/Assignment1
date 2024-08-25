//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank myBank = new Bank();
        myBank.accountType="Savings";
        myBank.accountBalance=15.0;

        System.out.println("Account Type:"+myBank.accountType);
        myBank.deposit(500);


    }
    }
