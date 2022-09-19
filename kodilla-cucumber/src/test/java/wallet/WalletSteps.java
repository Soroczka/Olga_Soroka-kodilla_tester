package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private int money;
    private int amount;
//    public WalletSteps(){
//
//        Given("I have deposited $200 in my wallet", () -> {
//            wallet.deposit(200);
//            Assert.assertEquals(200, wallet.getBalance());
//        });
//
//        When("I request $30", () -> {
//            Cashier cashier = new Cashier(cashSlot);
//            cashier.withdraw(wallet, 30);
//        });
//
//        Then("$30 should be dispensed", () -> {
//            Assert.assertEquals(30, cashSlot.getContents());
//        });
//
//    }

    public WalletSteps(){

        Given("I have deposited {int} in my wallet", (Integer int1) -> {
            this.money = int1;
            wallet.deposit(money);
            Assert.assertEquals(money, wallet.getBalance());
        });
        When("I request {int}", (Integer int1) -> {
            this.amount = int1;
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, amount);
        });
        Then("{int} should be dispensed", (Integer int1) -> {
            Assert.assertEquals(amount, cashSlot.getContents());
        });
    }
}
