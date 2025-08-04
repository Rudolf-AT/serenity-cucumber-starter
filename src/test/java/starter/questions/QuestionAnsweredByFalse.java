package starter.questions;

import net.serenitybdd.screenplay.Question;

/**
 * This class represents a question that always returns false.
 */
public class QuestionAnsweredByFalse implements Question<Boolean> {

    @Override
    public Boolean answeredBy(net.serenitybdd.screenplay.Actor actor) {
        return false;
    }

}
