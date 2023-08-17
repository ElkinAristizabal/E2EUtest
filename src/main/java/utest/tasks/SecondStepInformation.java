package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import utest.userinterfaces.SecondStepScreen;
import utest.utils.RandomGenerator;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SecondStepInformation implements Task {
    private final String city = RandomGenerator.city();
    private final String postalCode = RandomGenerator.postalCode();

    @Override
    @Step("{3} complete the information for the second step screen")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SecondStepScreen.VALIDATION_MESSAGE_AUTODETECT_POSTAL_CODE, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(city).into(SecondStepScreen.CITY),
                WaitUntil.the(SecondStepScreen.VALIDATION_MESSAGE, isVisible()).forNoMoreThan(30).seconds(),
                Hit.the(Keys.ARROW_DOWN).into(SecondStepScreen.CITY),
                Hit.the(Keys.ENTER).into(SecondStepScreen.CITY),
                Enter.theValue(postalCode).into(SecondStepScreen.POSTAL_CODE),
                Click.on(SecondStepScreen.COUNTRY_LIST),
                Click.on(SecondStepScreen.COUNTRY_VALUE),
                Click.on(SecondStepScreen.NEXT_BUTTON)

        );


    }

    public static SecondStepInformation with () {
        return instrumented(SecondStepInformation.class);
    }

}
