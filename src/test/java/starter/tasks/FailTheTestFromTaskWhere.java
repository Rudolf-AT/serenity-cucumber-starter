package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import starter.questions.QuestionAnsweredByFalse;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

/**
 * This class represents a task that intentionally fails the test.
 * Implemented by using "Task.where".
 */
public class FailTheTestFromTaskWhere {

    public static Performable failTheTestFromTaskWhere() {
        return Task.where("{0} fails the test",
                actor -> {
                    actor.should(seeThat(new QuestionAnsweredByFalse(), is(true)));
                }
        );
    }
}
