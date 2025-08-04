package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.tasks.FailTheTestFromTaskClass;
import starter.tasks.FailTheTestFromTaskWhere;

import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FailScenarioStepDefinitions {
    Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Actor");
    }

    @Given("the scenario fails from Task class")
    public void theScenarioFailsFromTaskClass() {
        actor.attemptsTo(new FailTheTestFromTaskClass());
    }

    @Given("the scenario fails from Task.where")
    public void theScenarioFailsFromTaskWhere() {
        actor.attemptsTo(FailTheTestFromTaskWhere.failTheTestFromTaskWhere());
    }

    /*
     * This step is just for demonstration purposes - where does
     * the report list the next step after the failure?
     */
    @When("just to see where the step is located in the report")
    public void justToSeeWhereTheStepIsLocatedInTheReport() {
        actor.should(seeThat(
                "the When step",
                Question.about("the result of the action")
                        .answeredBy(actor1 -> true),
                is(true)
        ));
    }

}
