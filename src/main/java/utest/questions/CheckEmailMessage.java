package utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utest.userinterfaces.WelcomeNewUserScreen;

public class CheckEmailMessage implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean comparate = WelcomeNewUserScreen.CHECK_EMAIL_MESSAGE.resolveFor(actor).getText().contains("First, please check your email inbox");
        return comparate;
    }

    public static CheckEmailMessage checkEmailMessage (){
        return new CheckEmailMessage();
    }
}
