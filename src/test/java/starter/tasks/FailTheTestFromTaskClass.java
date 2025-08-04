package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import starter.questions.QuestionAnsweredByFalse;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

/**
 * This class represents a task that intentionally fails the test.
 * Implemented as "Task" class.
 */
public class FailTheTestFromTaskClass implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(new QuestionAnsweredByFalse(), is(true)));
    }
}
