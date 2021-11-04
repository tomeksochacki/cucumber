import org.junit.Assert;
import org.junit.Test;

public class TestCashMachine {

    @Test
    public void testMoneyDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.moneyDeposit(200);
        Assert.assertTrue(cashMachine.showBalance()==200);
        cashMachine.moneyDeposit(-200);
        Assert.assertTrue(cashMachine.showBalance()==200);
    }

    @Test
    public void testCashWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.cashWithdrawal(200);
        Assert.assertTrue(cashMachine.showBalance()==0);
        cashMachine.moneyDeposit(200);
        cashMachine.cashWithdrawal(100);
        Assert.assertTrue(cashMachine.showBalance()==100);
    }
}
