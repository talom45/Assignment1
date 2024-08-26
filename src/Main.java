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
    }
}

