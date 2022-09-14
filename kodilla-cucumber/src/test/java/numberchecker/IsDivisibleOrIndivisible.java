package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsDivisibleOrIndivisible implements En{
    private int number;
    private String answer;

    public IsDivisibleOrIndivisible(){
        Given("Number to check is {int}", (Integer number) -> {
            this.number = number;
        });

        When("I ask is the number divisible or indivisible by three andor five", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);
        });

        Then("It should be {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}
