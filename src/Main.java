//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank myBank=new Bank("Savings", 15.0);

        System.out.println("Account Type:"+myBank.accountType);
        myBank.deposit(500);
        myBank.withdraw(55.98);
        myBank.display();

        Insurance myinsurance=new Insurance("Savings", 1000.0, "Life Insurance", "$100,000");
        myinsurance.displayInsuranceInfo();
        myinsurance.cover();

        Bank myBank2 = new Bank("TSM", 230761); // using initials and reg number as accountType and accountBalance
        myBank2.display2info();

    }
}

