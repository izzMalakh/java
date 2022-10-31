public class BankAccount{
    private String name;
    private double checkingBalance;
    private double savingsBalance;

    public static int numberOfAccounts=0;
    public static double totalMoneyStored=0;

    public BankAccount(){ // order constructor
        this.checkingBalance=0;
        this.savingsBalance=0;
        BankAccount.numberOfAccounts += 1;
    }

    public double getCheckingBalance(){
        return this.checkingBalance; 
    }
    public double getSavingBalance(){
        return this.savingsBalance;
    }
    public void depositMoney(double amount){

        this.savingsBalance += amount;
        BankAccount.totalMoneyStored  += 1;

    }
    //Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawMoney( double amount, String account){
        if (account == "check"){
            if (amount > this.checkingBalance){
                System.out.println("No Funds");
                return;
            }
            
        }else if (amount > this.savingsBalance){
                System.out.println("No Funds");
                return;
            }
        this.savingsBalance -= amount;
        BankAccount.totalMoneyStored  += 1;
    }
    //Create a method to see the total money from the checking and saving, (%.2f formats decimal to the 10s place (used for money))
    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
    }

}