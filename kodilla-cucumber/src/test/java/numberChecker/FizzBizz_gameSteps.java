package numberChecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBizz_gameSteps implements En {

    private int number;
    private String answer;

    public FizzBizz_gameSteps() {
        Given("the number is 9", () -> {
            this.number = 9;
        });
        Given("the number is 10", () -> {
            this.number = 10;
        });
        Given("the number is 15", () -> {
            this.number = 15;
        });
        Given("the number is 8", () -> {
            this.number = 8;
        });
        When("calculator check if the number is divisible by 3 or 5 or both or none", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkMyNumber(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}