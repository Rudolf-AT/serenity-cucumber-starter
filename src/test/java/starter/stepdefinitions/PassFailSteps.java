package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PassFailSteps {

    @Then("the scenario passes")
    public void should_pass() {
    }

    @Then("the scenario fails")
    public void should_fail() {
        Assert.fail();
    }
}
