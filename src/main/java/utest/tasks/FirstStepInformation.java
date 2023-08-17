package utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import utest.userinterfaces.FirstStepScreen;
import utest.utils.RandomGenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FirstStepInformation implements Task {

    private final String firstName = "Test First Name";
    private final String lastName = "Test Last Name";
    public final String email = RandomGenerator.email();
    private final String language = "Spanish";




    @Override
    @Step("{2} complete the information for the first step screen")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(FirstStepScreen.FIRST_NAME),
                Enter.theValue(lastName).into(FirstStepScreen.LAST_NAME),
                Enter.theValue(email).into(FirstStepScreen.EMAIL),
                Click.on(FirstStepScreen.BIRTH_MONTH_LIST),
                Click.on(FirstStepScreen.BIRTH_MONTH_VALUE),
                Click.on(FirstStepScreen.BIRTH_DAY_LIST),
                Click.on(FirstStepScreen.BIRTH_DAY_VALUE),
                Click.on(FirstStepScreen.BIRTH_YEAR_LIST),
                Click.on(FirstStepScreen.BIRTH_YEAR_VALUE),
                Enter.theValue(language).into(FirstStepScreen.LANGUAGES).thenHit(Keys.ENTER),
                Click.on(FirstStepScreen.NEXT_BUTTON)

        );
    }

    public static FirstStepInformation with ( ) {
        return instrumented(FirstStepInformation.class);
    }

}
