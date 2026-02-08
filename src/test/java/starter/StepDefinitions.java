package starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    @Given("I use Cucumber")
    public void i_use_cucumber() {
    }

    @When("I see a test pass")
    public void i_see_a_test_pass() {
    }

    @When("I see a test fail")
    public void i_see_a_test_fail() {
        Assert.fail("This test is designed to fail");
    }
}
