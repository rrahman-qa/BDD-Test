package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    int number1;
    int number2;
    int result;
    @When("^I add them$")
    public void iAddThem() {
        result = number1 + number2;
    }

    @Given("^I have the numbers (\\d+) and (\\d+)$")
    public void iHaveTheNumbersAnd(int arg0, int arg1) throws Throwable {
        number1 = arg0;
        number2 = arg1;
    }

    @Then("^The result is (\\d+)$")
    public void theResultIs(int arg0)  {
        Assert.assertEquals(result, arg0);
    }
}
