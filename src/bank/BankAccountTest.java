package bank;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        System.out.println(bankAccount.getAccount_number());
        System.out.println(bankAccount.getAccount_balance());
        System.out.println(bankAccount.getSavings_balance());
        bankAccount.addBalanceToAccount(100.0);
        bankAccount.addSavingsToAccount(30.0);
        System.out.println(bankAccount.getAccount_balance());
        System.out.println(bankAccount.getSavings_balance());
        System.out.println(BankAccount.accounts_counter);
        bankAccount.getTotal_account_money();

    }
}
