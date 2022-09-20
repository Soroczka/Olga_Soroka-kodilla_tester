package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private int money;
    private int amount;
    private String answer;
    private int balance;
    public WalletSteps(){

        Given("I have deposited {int} in my wallet", (Integer int1) -> {
            this.money = int1;
            wallet.deposit(money);
            Assert.assertEquals(money, wallet.getBalance());
        });
        Given("there is $100 in my wallet", () -> {
            this.money = 100;
            wallet.deposit(money);
            this.balance = wallet.getBalance();
            Assert.assertEquals(money, balance);
        });
        When("I request {int}", (Integer int1) -> {
            this.amount = int1;
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, amount);
        });
        When("I check the balance of my wallet", () -> {
            this.balance = wallet.getBalance();
        });
        When("I withdraw $200", () -> {
            this.amount = 200;
            Cashier cashier = new Cashier(cashSlot);
            answer = cashier.withdraw(wallet, amount);
        });
        Then("{int} should be dispensed", (Integer int1) -> {
            Assert.assertEquals(amount, cashSlot.getContents());
        });
        Then("the balance of my wallet should be {int}", (Integer int1) -> {
            this.balance = int1;
            Assert.assertEquals("Incorrect wallet balance", balance,  wallet.getBalance());
        });
        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(100, balance);
        });
        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, balance);
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("You don't have enough money", answer);
        });


    }
}
