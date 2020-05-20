package bank;

public class BankAccount {
    private int account_number;
    private double account_balance;
    private double savings_balance;
    static int accounts_counter = 0;

    public BankAccount(){
        this.account_number = randomNumbersAccount();
        accounts_counter += 1;
    }

    private int randomNumbersAccount(){
        return (int) (Math.random() * Math.pow(10, 10));
    }

    public long getAccount_number() {
        return account_number;
    }

//    public void setAccount_number(int account_number) {
//        this.account_number = account_number;
//    }
//


    public double getAccount_balance() {
        return account_balance;
    }

//    public void setAccount_balance(double account_balance) {
//        this.account_balance = account_balance;
//    }

    public double getSavings_balance() {
        return savings_balance;
    }

//    public void setSavings_balance(double savings_balance) {
//        this.savings_balance = savings_balance;
//    }

    public void addBalanceToAccount(double money){
        this.account_balance += money;
    }

    public void addSavingsToAccount(double money){
        this.savings_balance += money;
    }

    public  void getTotal_account_money() {
        System.out.println(account_balance);
        System.out.println(savings_balance);

    }

//    public static void setTotal_account_money(int total_account_money) {
//        BankAccount.total_account_money = total_account_money;
//    }



}
