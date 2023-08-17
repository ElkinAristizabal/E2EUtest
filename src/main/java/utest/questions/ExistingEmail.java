package utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utest.userinterfaces.FourthStepScreen;

public class ExistingEmail implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean comparate = FourthStepScreen.MESSAGE_EXISTING_EMAIL.resolveFor(actor).getText().contains("An account with the given email address already exists.");
        return comparate;
    }

    public static ExistingEmail existingEmail (){
        return new ExistingEmail();
    }
}
