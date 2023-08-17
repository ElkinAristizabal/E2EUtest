package utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utest.userinterfaces.FirstStepScreen;
import utest.userinterfaces.WelcomeNewUserScreen;

public class ValidTextBoxes implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean comparate = FirstStepScreen.FIRST_NAME.isVisibleFor(actor);
        Boolean comparate1 = FirstStepScreen.FIRST_NAME.isVisibleFor(actor);
        Boolean comparate2 = FirstStepScreen.FIRST_NAME.isVisibleFor(actor);
        Boolean comparateTotal = comparate || comparate1 || comparate2;
        return comparateTotal;
    }

    public static ValidTextBoxes validTextBoxes (){
        return new ValidTextBoxes();
    }
}
