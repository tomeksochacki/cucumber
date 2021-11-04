public class CashMachine {
    private int balance;

    //wpłata
    public void moneyDeposit(int deposit) {
        if (deposit > 0) {
            balance = balance + deposit;
        }
    }

    //wypłata
    public void cashWithdrawal(int withdrawal) {
        if (withdrawal <= balance) {
            balance = balance - withdrawal;
        } else {
            System.out.println("You don't have enough money in your account.");
        }
    }

    public int showBalance() {
        System.out.println("You have in your account" + balance);
        return balance;
    }
}
