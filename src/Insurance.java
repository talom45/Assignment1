public class Insurance extends Bank {
    String policyType;//using extends to inherit from the bank class
    String coverageAmount;

    public Insurance(String accountType, double accountBalance, String policyType,String coverageAmount) {
        super(accountType, accountBalance); // Call the Bank class constructor
        this.policyType = policyType;
        this.coverageAmount = coverageAmount;
    }
    public void displayInsuranceInfo() {
        display(); // Call the Bank class method
        System.out.println("Policy Type: " + policyType);
        System.out.println("Coverage Amount: " + coverageAmount);
    }
    public void cover(){
        System.out.println("You are covered");//method printing
    }
}
