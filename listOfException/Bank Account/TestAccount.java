class TestAccount {
    public static void main(String[] args ){

        BankAccount BankAccount1 = new BankAccount();
        

        BankAccount1.depositMoney(15000); 
        BankAccount1.withdrawMoney(70, " ");
        BankAccount1.withdrawMoney(3500, " ");
        System.out.println(BankAccount1.getSavingBalance());
        BankAccount1.depositMoney(150); 
        BankAccount1.displayAccountBalance();


        BankAccount BankAccount2 = new BankAccount();
        BankAccount2.depositMoney(450);
        BankAccount2.depositMoney(600);
        BankAccount2.withdrawMoney(10, "check");
        BankAccount2.withdrawMoney(70, " ");
        BankAccount2.withdrawMoney(35, "check");
        BankAccount2.displayAccountBalance();

        System.out.println(BankAccount.totalMoneyStored);
    }   
}